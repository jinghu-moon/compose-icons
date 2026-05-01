package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorLightIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 136.0f),
                    PathNode.CurveTo(198.0f, 139.3137f, 195.3137f, 142.0f, 192.0f, 142.0f),
                    PathNode.LineTo(64.0f, 142.0f),
                    PathNode.CurveTo(60.68629f, 142.0f, 58.0f, 139.3137f, 58.0f, 136.0f),
                    PathNode.CurveTo(58.0f, 132.6863f, 60.68629f, 130.0f, 64.0f, 130.0f),
                    PathNode.LineTo(192.0f, 130.0f),
                    PathNode.CurveTo(195.3137f, 130.0f, 198.0f, 132.6863f, 198.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 82.0f),
                    PathNode.LineTo(24.0f, 82.0f),
                    PathNode.CurveTo(20.68629f, 82.0f, 18.0f, 84.686295f, 18.0f, 88.0f),
                    PathNode.CurveTo(18.0f, 91.313705f, 20.68629f, 94.0f, 24.0f, 94.0f),
                    PathNode.LineTo(232.0f, 94.0f),
                    PathNode.CurveTo(235.3137f, 94.0f, 238.0f, 91.313705f, 238.0f, 88.0f),
                    PathNode.CurveTo(238.0f, 84.686295f, 235.3137f, 82.0f, 232.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 178.0f),
                    PathNode.LineTo(104.0f, 178.0f),
                    PathNode.CurveTo(100.686295f, 178.0f, 98.0f, 180.6863f, 98.0f, 184.0f),
                    PathNode.CurveTo(98.0f, 187.3137f, 100.686295f, 190.0f, 104.0f, 190.0f),
                    PathNode.LineTo(152.0f, 190.0f),
                    PathNode.CurveTo(155.3137f, 190.0f, 158.0f, 187.3137f, 158.0f, 184.0f),
                    PathNode.CurveTo(158.0f, 180.6863f, 155.3137f, 178.0f, 152.0f, 178.0f),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
