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
                pathData = parseSvgPathData("M13.225 18.412c-.3 .369-.749 .584-1.225 .588-.468 0-.914-.214-1.225-.588L6.414 13.164c-.552-.678-.552-1.65 0-2.328L10.775 5.588C11.075 5.219 11.524 5.004 12 5c.468 0 .914 .214 1.225 .588l4.361 5.248c.552 .678 .552 1.65 0 2.328l-4.361 5.248"),
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
