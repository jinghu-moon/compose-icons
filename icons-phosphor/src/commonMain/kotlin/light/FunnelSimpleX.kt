package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorLightIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 142.0f),
                    PathNode.LineTo(64.0f, 142.0f),
                    PathNode.CurveTo(60.68629f, 142.0f, 58.0f, 139.3137f, 58.0f, 136.0f),
                    PathNode.CurveTo(58.0f, 132.6863f, 60.68629f, 130.0f, 64.0f, 130.0f),
                    PathNode.LineTo(192.0f, 130.0f),
                    PathNode.CurveTo(195.3137f, 130.0f, 198.0f, 132.6863f, 198.0f, 136.0f),
                    PathNode.CurveTo(198.0f, 139.3137f, 195.3137f, 142.0f, 192.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 82.0f),
                    PathNode.LineTo(24.0f, 82.0f),
                    PathNode.CurveTo(20.68629f, 82.0f, 18.0f, 84.686295f, 18.0f, 88.0f),
                    PathNode.CurveTo(18.0f, 91.313705f, 20.68629f, 94.0f, 24.0f, 94.0f),
                    PathNode.LineTo(232.0f, 94.0f),
                    PathNode.CurveTo(235.3137f, 94.0f, 238.0f, 91.313705f, 238.0f, 88.0f),
                    PathNode.CurveTo(238.0f, 84.686295f, 235.3137f, 82.0f, 232.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 178.0f),
                    PathNode.LineTo(104.0f, 178.0f),
                    PathNode.CurveTo(100.686295f, 178.0f, 98.0f, 180.6863f, 98.0f, 184.0f),
                    PathNode.CurveTo(98.0f, 187.3137f, 100.686295f, 190.0f, 104.0f, 190.0f),
                    PathNode.LineTo(128.0f, 190.0f),
                    PathNode.CurveTo(131.3137f, 190.0f, 134.0f, 187.3137f, 134.0f, 184.0f),
                    PathNode.CurveTo(134.0f, 180.6863f, 131.3137f, 178.0f, 128.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.24f, 171.76f),
                    PathNode.CurveTo(217.89746f, 169.42038f, 214.10254f, 169.42038f, 211.76f, 171.76f),
                    PathNode.LineTo(192.0f, 191.51f),
                    PathNode.LineTo(172.24f, 171.76f),
                    PathNode.CurveTo(169.87592f, 169.55713f, 166.19193f, 169.62213f, 163.90703f, 171.90703f),
                    PathNode.CurveTo(161.62213f, 174.19193f, 161.55713f, 177.87592f, 163.76f, 180.24f),
                    PathNode.LineTo(183.51f, 200.0f),
                    PathNode.LineTo(163.76f, 219.76f),
                    PathNode.CurveTo(162.15477f, 221.25575f, 161.494f, 223.50844f, 162.03691f, 225.63431f),
                    PathNode.CurveTo(162.57982f, 227.76018f, 164.23982f, 229.42018f, 166.36569f, 229.96309f),
                    PathNode.CurveTo(168.49156f, 230.506f, 170.74425f, 229.84523f, 172.24f, 228.24f),
                    PathNode.LineTo(192.0f, 208.49f),
                    PathNode.LineTo(211.76f, 228.24f),
                    PathNode.CurveTo(214.12408f, 230.44287f, 217.80807f, 230.37787f, 220.09297f, 228.09297f),
                    PathNode.CurveTo(222.37787f, 225.80807f, 222.44287f, 222.12408f, 220.24f, 219.76f),
                    PathNode.LineTo(200.49f, 200.0f),
                    PathNode.LineTo(220.24f, 180.24f),
                    PathNode.CurveTo(222.57962f, 177.89746f, 222.57962f, 174.10254f, 220.24f, 171.76f),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
