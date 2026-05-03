package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorLightIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 109.21f),
                    PathNode.LineTo(125.0f, 173.21f),
                    PathNode.CurveTo(126.85641f, 174.2818f, 129.1436f, 174.2818f, 131.0f, 173.21f),
                    PathNode.LineTo(243.0f, 109.21f),
                    PathNode.CurveTo(244.86998f, 108.14189f, 246.02411f, 106.153534f, 246.02411f, 104.0f),
                    PathNode.CurveTo(246.02411f, 101.846466f, 244.86998f, 99.85811f, 243.0f, 98.79f),
                    PathNode.LineTo(131.0f, 34.79f),
                    PathNode.CurveTo(129.1436f, 33.718204f, 126.85641f, 33.718204f, 125.0f, 34.79f),
                    PathNode.LineTo(13.0f, 98.79f),
                    PathNode.CurveTo(11.130017f, 99.85811f, 9.975886f, 101.846466f, 9.975886f, 104.0f),
                    PathNode.CurveTo(9.975886f, 106.153534f, 11.130017f, 108.14189f, 13.0f, 109.21f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 46.91f),
                    PathNode.LineTo(227.91f, 104.0f),
                    PathNode.LineTo(128.0f, 161.09f),
                    PathNode.LineTo(28.09f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(245.21f, 141.0f),
                    PathNode.CurveTo(246.0009f, 142.38165f, 246.21027f, 144.02098f, 245.79202f, 145.55707f),
                    PathNode.CurveTo(245.37376f, 147.09315f, 244.3622f, 148.40002f, 242.98f, 149.19f),
                    PathNode.LineTo(130.98f, 213.19f),
                    PathNode.CurveTo(129.1236f, 214.2618f, 126.8364f, 214.2618f, 124.98f, 213.19f),
                    PathNode.LineTo(12.98f, 149.19f),
                    PathNode.CurveTo(10.102596f, 147.53314f, 9.113146f, 143.8574f, 10.77f, 140.98f),
                    PathNode.CurveTo(12.426854f, 138.10262f, 16.102596f, 137.11313f, 18.98f, 138.77f),
                    PathNode.LineTo(127.98f, 201.07f),
                    PathNode.LineTo(236.98f, 138.77f),
                    PathNode.CurveTo(238.36525f, 137.96635f, 240.0143f, 137.74985f, 241.56006f, 138.16869f),
                    PathNode.CurveTo(243.1058f, 138.58752f, 244.41997f, 139.60693f, 245.21f, 141.0f),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
