package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorLightIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(123.76f, 108.24f),
                    PathNode.CurveTo(126.10254f, 110.57962f, 129.89746f, 110.57962f, 132.24f, 108.24f),
                    PathNode.LineTo(172.24f, 68.24f),
                    PathNode.CurveTo(174.57962f, 65.89746f, 174.57962f, 62.10254f, 172.24f, 59.76f),
                    PathNode.LineTo(132.24f, 19.76f),
                    PathNode.CurveTo(129.89746f, 17.420374f, 126.10254f, 17.420374f, 123.76f, 19.76f),
                    PathNode.LineTo(83.76f, 59.76f),
                    PathNode.CurveTo(81.42038f, 62.10254f, 81.42038f, 65.89746f, 83.76f, 68.24f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.49f),
                    PathNode.LineTo(159.51f, 64.0f),
                    PathNode.LineTo(128.0f, 95.51f),
                    PathNode.LineTo(96.49f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.24f, 147.76f),
                    PathNode.CurveTo(129.89746f, 145.42038f, 126.10254f, 145.42038f, 123.76f, 147.76f),
                    PathNode.LineTo(83.76f, 187.76f),
                    PathNode.CurveTo(81.42038f, 190.10254f, 81.42038f, 193.89746f, 83.76f, 196.24f),
                    PathNode.LineTo(123.76f, 236.24f),
                    PathNode.CurveTo(126.10254f, 238.57962f, 129.89746f, 238.57962f, 132.24f, 236.24f),
                    PathNode.LineTo(172.24f, 196.24f),
                    PathNode.CurveTo(174.57962f, 193.89746f, 174.57962f, 190.10254f, 172.24f, 187.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 223.51f),
                    PathNode.LineTo(96.49f, 192.0f),
                    PathNode.LineTo(128.0f, 160.49f),
                    PathNode.LineTo(159.51f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.24f, 123.76f),
                    PathNode.LineTo(196.24f, 83.76f),
                    PathNode.CurveTo(193.89746f, 81.42038f, 190.10254f, 81.42038f, 187.76f, 83.76f),
                    PathNode.LineTo(147.76f, 123.76f),
                    PathNode.CurveTo(145.42038f, 126.10254f, 145.42038f, 129.89746f, 147.76f, 132.24f),
                    PathNode.LineTo(187.76f, 172.24f),
                    PathNode.CurveTo(190.10254f, 174.57962f, 193.89746f, 174.57962f, 196.24f, 172.24f),
                    PathNode.LineTo(236.24f, 132.24f),
                    PathNode.CurveTo(238.57962f, 129.89746f, 238.57962f, 126.10254f, 236.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 159.51f),
                    PathNode.LineTo(160.49f, 128.0f),
                    PathNode.LineTo(192.0f, 96.49f),
                    PathNode.LineTo(223.51f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.24f, 123.76f),
                    PathNode.LineTo(68.24f, 83.76f),
                    PathNode.CurveTo(65.89746f, 81.42038f, 62.10254f, 81.42038f, 59.76f, 83.76f),
                    PathNode.LineTo(19.76f, 123.76f),
                    PathNode.CurveTo(17.420374f, 126.10254f, 17.420374f, 129.89746f, 19.76f, 132.24f),
                    PathNode.LineTo(59.76f, 172.24f),
                    PathNode.CurveTo(62.10254f, 174.57962f, 65.89746f, 174.57962f, 68.24f, 172.24f),
                    PathNode.LineTo(108.24f, 132.24f),
                    PathNode.CurveTo(110.57962f, 129.89746f, 110.57962f, 126.10254f, 108.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 159.51f),
                    PathNode.LineTo(32.49f, 128.0f),
                    PathNode.LineTo(64.0f, 96.49f),
                    PathNode.LineTo(95.51f, 128.0f),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
