package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorFillIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.68f, 66.15f),
                    PathNode.LineTo(135.68f, 18.0f),
                    PathNode.CurveTo(130.90053f, 15.359137f, 125.099464f, 15.359137f, 120.32f, 18.0f),
                    PathNode.LineTo(32.32f, 66.17f),
                    PathNode.CurveTo(27.201473f, 68.9706f, 24.013245f, 74.3354f, 24.0f, 80.17f),
                    PathNode.LineTo(24.0f, 175.81f),
                    PathNode.CurveTo(24.013245f, 181.64459f, 27.201473f, 187.0094f, 32.32f, 189.81f),
                    PathNode.LineTo(120.32f, 237.98f),
                    PathNode.CurveTo(125.099464f, 240.62086f, 130.90053f, 240.62086f, 135.68f, 237.98f),
                    PathNode.LineTo(223.68f, 189.81f),
                    PathNode.CurveTo(228.79852f, 187.0094f, 231.98676f, 181.64459f, 232.0f, 175.81f),
                    PathNode.LineTo(232.0f, 80.18f),
                    PathNode.CurveTo(231.9977f, 74.33465f, 228.80794f, 68.955765f, 223.68f, 66.15f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _nut!!
    }

private var _nut: ImageVector? = null
