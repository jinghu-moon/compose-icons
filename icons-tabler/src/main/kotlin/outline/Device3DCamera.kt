package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Device3DCamera: ImageVector
    get() {
        if (_device3DCamera != null) return _device3DCamera!!
        _device3DCamera = tablerOutlineIcon(
            name = "Device3DCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 8.000 C 11.000 6.895 11.895 6.000 13.000 6.000 C 14.105 6.000 15.000 6.895 15.000 8.000 C 15.000 9.105 14.105 10.000 13.000 10.000 C 11.895 10.000 11.000 9.105 11.000 8.000"),
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
                pathData = parseSvgPathData("M 8.000 6.000 C 8.000 4.343 9.343 3.000 11.000 3.000 L 15.000 3.000 C 16.657 3.000 18.000 4.343 18.000 6.000 L 18.000 18.000 C 18.000 19.657 16.657 21.000 15.000 21.000 L 11.000 21.000 C 9.343 21.000 8.000 19.657 8.000 18.000 L 8.000 6.000"),
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
                pathData = parseSvgPathData("M 13.000 14.000 L 13.000 16.000"),
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
        return _device3DCamera!!
    }

private var _device3DCamera: ImageVector? = null
