package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Keyframe: ImageVector
    get() {
        if (_keyframe != null) return _keyframe!!
        _keyframe = tablerOutlineIcon(
            name = "Keyframe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.225 18.412 C 12.925 18.781 12.476 18.996 12.000 19.000 C 11.532 19.000 11.086 18.786 10.775 18.412 L 6.414 13.164 C 5.862 12.486 5.862 11.514 6.414 10.836 L 10.775 5.588 C 11.075 5.219 11.524 5.004 12.000 5.000 C 12.468 5.000 12.914 5.214 13.225 5.588 L 17.586 10.836 C 18.138 11.514 18.138 12.486 17.586 13.164 L 13.225 18.412"),
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
        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
