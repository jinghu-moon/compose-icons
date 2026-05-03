package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorRegularIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(40.235497f, 56.0f, 8.0f, 88.2355f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 167.7645f, 40.235497f, 200.0f, 80.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(215.7645f, 200.0f, 248.0f, 167.7645f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 88.2355f, 215.7645f, 56.0f, 176.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(49.072056f, 184.0f, 24.0f, 158.92795f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 97.07206f, 49.072056f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(206.92795f, 72.0f, 232.0f, 97.07206f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 158.92795f, 206.92795f, 184.0f, 176.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 88.0f),
                    PathNode.CurveTo(57.90861f, 88.0f, 40.0f, 105.90861f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 150.09138f, 57.90861f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(102.09139f, 168.0f, 120.0f, 150.09138f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 105.90861f, 102.09139f, 88.0f, 80.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 152.0f),
                    PathNode.CurveTo(66.74516f, 152.0f, 56.0f, 141.25484f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 114.74516f, 66.74516f, 104.0f, 80.0f, 104.0f),
                    PathNode.CurveTo(93.25484f, 104.0f, 104.0f, 114.74516f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 141.25484f, 93.25484f, 152.0f, 80.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
