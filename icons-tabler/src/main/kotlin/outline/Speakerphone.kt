package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Speakerphone: ImageVector
    get() {
        if (_speakerphone != null) return _speakerphone!!
        _speakerphone = tablerOutlineIcon(
            name = "Speakerphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 8.000 C 19.657 8.000 21.000 9.343 21.000 11.000 C 21.000 12.657 19.657 14.000 18.000 14.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 10.000 8.000 L 10.000 19.000 C 10.000 19.552 9.552 20.000 9.000 20.000 L 8.000 20.000 C 7.448 20.000 7.000 19.552 7.000 19.000 L 7.000 14.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 8.000 L 16.524 4.230 C 16.792 4.006 17.166 3.958 17.482 4.107 C 17.798 4.255 18.000 4.573 18.000 4.922 L 18.000 17.078 C 18.000 17.427 17.798 17.745 17.482 17.893 C 17.166 18.042 16.792 17.994 16.524 17.770 L 12.000 14.000 L 4.000 14.000 C 3.448 14.000 3.000 13.552 3.000 13.000 L 3.000 9.000 C 3.000 8.448 3.448 8.000 4.000 8.000 L 12.000 8.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _speakerphone!!
    }

private var _speakerphone: ImageVector? = null
