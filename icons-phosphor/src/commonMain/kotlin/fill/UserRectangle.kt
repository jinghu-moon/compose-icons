package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorFillIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 144.30052f, 152.30052f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(103.69947f, 164.0f, 84.0f, 144.30052f, 84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 95.69947f, 103.69947f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(152.30052f, 76.0f, 172.0f, 95.69947f, 172.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(54.68f, 200.0f),
                    PathNode.CurveTo(60.896416f, 185.7798f, 71.11481f, 173.67479f, 84.09f, 165.16f),
                    PathNode.CurveTo(85.58697f, 164.16708f, 87.56225f, 164.29385f, 88.92f, 165.47f),
                    PathNode.CurveTo(111.371826f, 184.8433f, 144.62817f, 184.8433f, 167.08f, 165.47f),
                    PathNode.CurveTo(168.43774f, 164.29385f, 170.41304f, 164.16708f, 171.91f, 165.16f),
                    PathNode.CurveTo(184.8852f, 173.67479f, 195.10358f, 185.7798f, 201.32f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
