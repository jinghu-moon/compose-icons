package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorThinIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.43f, 130.06f),
                    PathNode.CurveTo(226.88385f, 130.96991f, 225.9985f, 131.6255f, 224.96884f, 131.88245f),
                    PathNode.CurveTo(223.93918f, 132.13939f, 222.84962f, 131.97664f, 221.94f, 131.43f),
                    PathNode.CurveTo(221.56f, 131.2f, 184.07f, 109.14f, 132.0f, 108.05f),
                    PathNode.LineTo(132.0f, 150.48f),
                    PathNode.LineTo(195.0f, 221.34f),
                    PathNode.CurveTo(196.46907f, 222.99686f, 196.31685f, 225.53093f, 194.66f, 227.0f),
                    PathNode.CurveTo(193.00314f, 228.46907f, 190.46907f, 228.31685f, 189.0f, 226.66f),
                    PathNode.LineTo(128.0f, 158.0f),
                    PathNode.LineTo(67.0f, 226.66f),
                    PathNode.CurveTo(65.53092f, 228.31685f, 62.996853f, 228.46907f, 61.34f, 227.0f),
                    PathNode.CurveTo(59.683147f, 225.53093f, 59.53092f, 222.99686f, 61.0f, 221.34f),
                    PathNode.LineTo(124.0f, 150.48f),
                    PathNode.LineTo(124.0f, 108.05f),
                    PathNode.CurveTo(71.93f, 109.14f, 34.44f, 131.2f, 34.06f, 131.43f),
                    PathNode.CurveTo(32.165665f, 132.5677f, 29.707706f, 131.95433f, 28.57f, 130.06f),
                    PathNode.CurveTo(27.432293f, 128.16566f, 28.045664f, 125.70771f, 29.94f, 124.57f),
                    PathNode.CurveTo(31.61f, 123.57f, 71.54f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(184.46f, 100.0f, 224.39f, 123.57f, 226.06f, 124.57f),
                    PathNode.CurveTo(226.96991f, 125.11615f, 227.6255f, 126.001495f, 227.88245f, 127.03116f),
                    PathNode.CurveTo(228.13939f, 128.06082f, 227.97664f, 129.15038f, 227.43f, 130.06f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 32.536026f, 112.536026f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(143.46397f, 20.0f, 156.0f, 32.536026f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 63.46397f, 143.46397f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(112.536026f, 76.0f, 100.0f, 63.46397f, 100.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 59.045696f, 116.95431f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(139.0457f, 68.0f, 148.0f, 59.045696f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 36.954304f, 139.0457f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(116.95431f, 28.0f, 108.0f, 36.954304f, 108.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
