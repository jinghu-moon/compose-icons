package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorLightIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 164.24f),
                    PathNode.LineTo(180.24f, 212.24f),
                    PathNode.CurveTo(177.89746f, 214.57962f, 174.10254f, 214.57962f, 171.76f, 212.24f),
                    PathNode.LineTo(123.76f, 164.24f),
                    PathNode.CurveTo(122.15478f, 162.74425f, 121.494f, 160.49156f, 122.03692f, 158.36569f),
                    PathNode.CurveTo(122.57983f, 156.23982f, 124.23982f, 154.57982f, 126.3657f, 154.03691f),
                    PathNode.CurveTo(128.49156f, 153.494f, 130.74423f, 154.15477f, 132.24f, 155.76f),
                    PathNode.LineTo(170.0f, 193.51f),
                    PathNode.LineTo(170.0f, 70.0f),
                    PathNode.LineTo(32.0f, 70.0f),
                    PathNode.CurveTo(28.68629f, 70.0f, 26.0f, 67.313705f, 26.0f, 64.0f),
                    PathNode.CurveTo(26.0f, 60.68629f, 28.68629f, 58.0f, 32.0f, 58.0f),
                    PathNode.LineTo(176.0f, 58.0f),
                    PathNode.CurveTo(179.3137f, 58.0f, 182.0f, 60.68629f, 182.0f, 64.0f),
                    PathNode.LineTo(182.0f, 193.51f),
                    PathNode.LineTo(219.76f, 155.76f),
                    PathNode.CurveTo(222.12408f, 153.55713f, 225.80807f, 153.62213f, 228.09297f, 155.90703f),
                    PathNode.CurveTo(230.37787f, 158.19193f, 230.44287f, 161.87592f, 228.24f, 164.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
