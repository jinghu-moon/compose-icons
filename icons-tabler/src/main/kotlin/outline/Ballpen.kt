package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ballpen: ImageVector
    get() {
        if (_ballpen != null) return _ballpen!!
        _ballpen = tablerOutlineIcon(
            name = "Ballpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 6.000 L 21.000 13.000 L 17.000 17.000"),
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
                pathData = parseSvgPathData("M 5.828 18.172 C 6.358 18.703 7.078 19.001 7.828 19.001 C 8.578 19.001 9.298 18.703 9.828 18.172 L 20.414 7.586 C 20.789 7.211 21.000 6.702 21.000 6.172 C 21.000 5.641 20.789 5.132 20.414 4.757 L 19.243 3.586 C 18.868 3.211 18.359 3.000 17.829 3.000 C 17.298 3.000 16.789 3.211 16.414 3.586 L 5.828 14.172 C 5.297 14.702 4.999 15.422 4.999 16.172 C 4.999 16.922 5.297 17.642 5.828 18.172"),
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
                pathData = parseSvgPathData("M 4.000 20.000 L 5.768 18.232"),
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
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
