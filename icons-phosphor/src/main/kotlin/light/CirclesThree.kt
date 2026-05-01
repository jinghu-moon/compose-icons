package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorLightIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.0f, 76.0f),
                    PathNode.CurveTo(170.0f, 52.80404f, 151.19595f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(104.80404f, 34.0f, 86.0f, 52.80404f, 86.0f, 76.0f),
                    PathNode.CurveTo(86.0f, 99.19596f, 104.80404f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(151.19595f, 118.0f, 170.0f, 99.19596f, 170.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 106.0f),
                    PathNode.CurveTo(111.43146f, 106.0f, 98.0f, 92.56854f, 98.0f, 76.0f),
                    PathNode.CurveTo(98.0f, 59.431458f, 111.43146f, 46.0f, 128.0f, 46.0f),
                    PathNode.CurveTo(144.56854f, 46.0f, 158.0f, 59.431458f, 158.0f, 76.0f),
                    PathNode.CurveTo(158.0f, 92.56854f, 144.56854f, 106.0f, 128.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 130.0f),
                    PathNode.CurveTo(164.80405f, 130.0f, 146.0f, 148.80405f, 146.0f, 172.0f),
                    PathNode.CurveTo(146.0f, 195.19595f, 164.80405f, 214.0f, 188.0f, 214.0f),
                    PathNode.CurveTo(211.19595f, 214.0f, 230.0f, 195.19595f, 230.0f, 172.0f),
                    PathNode.CurveTo(230.0f, 148.80405f, 211.19595f, 130.0f, 188.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 202.0f),
                    PathNode.CurveTo(171.43146f, 202.0f, 158.0f, 188.56854f, 158.0f, 172.0f),
                    PathNode.CurveTo(158.0f, 155.43146f, 171.43146f, 142.0f, 188.0f, 142.0f),
                    PathNode.CurveTo(204.56854f, 142.0f, 218.0f, 155.43146f, 218.0f, 172.0f),
                    PathNode.CurveTo(218.0f, 188.56854f, 204.56854f, 202.0f, 188.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 130.0f),
                    PathNode.CurveTo(44.80404f, 130.0f, 26.0f, 148.80405f, 26.0f, 172.0f),
                    PathNode.CurveTo(26.0f, 195.19595f, 44.80404f, 214.0f, 68.0f, 214.0f),
                    PathNode.CurveTo(91.19596f, 214.0f, 110.0f, 195.19595f, 110.0f, 172.0f),
                    PathNode.CurveTo(110.0f, 148.80405f, 91.19596f, 130.0f, 68.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 202.0f),
                    PathNode.CurveTo(51.431458f, 202.0f, 38.0f, 188.56854f, 38.0f, 172.0f),
                    PathNode.CurveTo(38.0f, 155.43146f, 51.431458f, 142.0f, 68.0f, 142.0f),
                    PathNode.CurveTo(84.56854f, 142.0f, 98.0f, 155.43146f, 98.0f, 172.0f),
                    PathNode.CurveTo(98.0f, 188.56854f, 84.56854f, 202.0f, 68.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
