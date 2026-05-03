package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moustache: ImageVector
    get() {
        if (_moustache != null) return _moustache!!
        _moustache = tablerOutlineIcon(
            name = "Moustache",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 9.000 C 16.072 9.000 17.063 9.572 17.599 10.500 C 18.532 11.833 19.732 12.056 20.725 12.056 L 21.016 12.056 L 21.786 12.012 L 21.999 12.012 C 21.036 13.938 18.836 14.937 15.399 15.012 L 14.999 15.012 L 14.834 15.012 C 13.177 14.966 11.871 13.586 11.917 11.929 C 11.962 10.273 13.342 8.966 14.999 9.012 L 15.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 9.000 C 7.928 9.000 6.937 9.572 6.401 10.500 C 5.468 11.833 4.268 12.056 3.275 12.056 L 2.984 12.056 L 2.214 12.012 L 2.001 12.012 C 2.964 13.938 5.164 14.937 8.601 15.012 L 9.001 15.012 L 9.166 15.012 C 10.823 14.966 12.129 13.586 12.083 11.929 C 12.038 10.273 10.658 8.966 9.001 9.012 L 9.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _moustache!!
    }

private var _moustache: ImageVector? = null
