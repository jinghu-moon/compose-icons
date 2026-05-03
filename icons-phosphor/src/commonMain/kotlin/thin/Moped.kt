package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorThinIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 132.0f),
                    PathNode.CurveTo(213.02565f, 131.99782f, 210.0627f, 132.36734f, 207.18f, 133.1f),
                    PathNode.LineTo(171.75f, 38.6f),
                    PathNode.CurveTo(171.16542f, 37.035408f, 169.67023f, 35.99875f, 168.0f, 36.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.CurveTo(133.79086f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 42.20914f, 133.79086f, 44.0f, 136.0f, 44.0f),
                    PathNode.LineTo(165.23f, 44.0f),
                    PathNode.LineTo(199.7f, 135.92f),
                    PathNode.CurveTo(188.90578f, 141.41588f, 181.59196f, 151.96402f, 180.23f, 164.0f),
                    PathNode.LineTo(133.77f, 164.0f),
                    PathNode.LineTo(107.77f, 94.6f),
                    PathNode.CurveTo(107.18288f, 93.02853f, 105.67754f, 91.99037f, 104.0f, 92.0f),
                    PathNode.LineTo(24.0f, 92.0f),
                    PathNode.CurveTo(21.790861f, 92.0f, 20.0f, 93.79086f, 20.0f, 96.0f),
                    PathNode.CurveTo(20.0f, 98.20914f, 21.790861f, 100.0f, 24.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 120.0f),
                    PathNode.CurveTo(16.640192f, 128.09566f, 4.02684f, 147.01569f, 4.0f, 168.0f),
                    PathNode.CurveTo(4.0f, 170.20914f, 5.790861f, 172.0f, 8.0f, 172.0f),
                    PathNode.LineTo(20.23f, 172.0f),
                    PathNode.CurveTo(22.296455f, 190.19322f, 37.689804f, 203.9371f, 56.0f, 203.9371f),
                    PathNode.CurveTo(74.31019f, 203.9371f, 89.703545f, 190.19322f, 91.77f, 172.0f),
                    PathNode.LineTo(180.23f, 172.0f),
                    PathNode.CurveTo(182.38148f, 191.24347f, 199.36922f, 205.33794f, 218.67917f, 203.90068f),
                    PathNode.CurveTo(237.98914f, 202.46346f, 252.70314f, 186.00943f, 251.98212f, 166.65948f),
                    PathNode.CurveTo(251.2611f, 147.30956f, 235.36337f, 131.99619f, 216.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(41.33f, 126.5f),
                    PathNode.CurveTo(42.929073f, 125.93623f, 43.998978f, 124.425545f, 44.0f, 122.73f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.LineTo(101.23f, 100.0f),
                    PathNode.LineTo(125.23f, 164.0f),
                    PathNode.LineTo(12.23f, 164.0f),
                    PathNode.CurveTo(13.801952f, 146.9006f, 25.156439f, 132.26854f, 41.33f, 126.5f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 196.0f),
                    PathNode.CurveTo(42.08228f, 195.9986f, 30.278246f, 185.77498f, 28.29f, 172.0f),
                    PathNode.LineTo(83.71f, 172.0f),
                    PathNode.CurveTo(81.72175f, 185.77498f, 69.91772f, 195.9986f, 56.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 196.0f),
                    PathNode.CurveTo(203.21902f, 195.99411f, 192.06416f, 187.33421f, 188.89008f, 174.95364f),
                    PathNode.CurveTo(185.71599f, 162.57307f, 191.32838f, 149.61444f, 202.53f, 143.46f),
                    PathNode.LineTo(212.25f, 169.4f),
                    PathNode.CurveTo(213.0232f, 171.47107f, 215.32893f, 172.5232f, 217.4f, 171.75f),
                    PathNode.CurveTo(219.47107f, 170.9768f, 220.5232f, 168.67107f, 219.75f, 166.6f),
                    PathNode.LineTo(210.0f, 140.65f),
                    PathNode.CurveTo(220.47765f, 138.35214f, 231.3472f, 142.24214f, 237.98769f, 150.66623f),
                    PathNode.CurveTo(244.62816f, 159.09033f, 245.87233f, 170.56775f, 241.19124f, 180.21912f),
                    PathNode.CurveTo(236.51016f, 189.87047f, 226.72667f, 195.99928f, 216.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _moped!!
    }

private var _moped: ImageVector? = null
