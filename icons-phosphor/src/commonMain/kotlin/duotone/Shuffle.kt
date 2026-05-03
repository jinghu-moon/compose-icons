package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorDuotoneIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(107.14f, 98.8f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(107.14f, 157.2f),
                    PathNode.CurveTo(95.12608f, 174.01897f, 75.7291f, 184.00052f, 55.06f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.LineTo(55.06f, 72.0f),
                    PathNode.CurveTo(75.7291f, 71.99948f, 95.12608f, 81.98103f, 107.14f, 98.8f),
                    PathNode.Close,
                    PathNode.MoveTo(200.94f, 72.0f),
                    PathNode.CurveTo(180.27089f, 71.99948f, 160.87392f, 81.98103f, 148.86f, 98.8f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(148.86f, 157.2f),
                    PathNode.CurveTo(160.87392f, 174.01897f, 180.27089f, 184.00052f, 200.94f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 178.34f),
                    PathNode.CurveTo(239.16223f, 179.84055f, 240.00629f, 181.87672f, 240.00629f, 184.0f),
                    PathNode.CurveTo(240.00629f, 186.12328f, 239.16223f, 188.15945f, 237.66f, 189.66f),
                    PathNode.LineTo(213.66f, 213.66f),
                    PathNode.CurveTo(210.53407f, 216.78593f, 205.46593f, 216.78593f, 202.34f, 213.66f),
                    PathNode.CurveTo(199.21407f, 210.53407f, 199.21407f, 205.46593f, 202.34f, 202.34f),
                    PathNode.LineTo(212.69f, 192.0f),
                    PathNode.LineTo(200.94f, 192.0f),
                    PathNode.CurveTo(177.69208f, 191.98068f, 155.87904f, 180.75584f, 142.35f, 161.85f),
                    PathNode.LineTo(100.63f, 103.45f),
                    PathNode.CurveTo(90.10667f, 88.746315f, 73.14145f, 80.01613f, 55.06f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(27.581722f, 80.0f, 24.0f, 76.41828f, 24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 67.58172f, 27.581722f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(55.06f, 64.0f),
                    PathNode.CurveTo(78.30792f, 64.019325f, 100.12095f, 75.24415f, 113.65f, 94.15f),
                    PathNode.LineTo(155.37f, 152.55f),
                    PathNode.CurveTo(165.89334f, 167.2537f, 182.85855f, 175.98387f, 200.94f, 176.0f),
                    PathNode.LineTo(212.69f, 176.0f),
                    PathNode.LineTo(202.34f, 165.66f),
                    PathNode.CurveTo(199.21407f, 162.53407f, 199.21407f, 157.46593f, 202.34f, 154.34f),
                    PathNode.CurveTo(205.46593f, 151.21407f, 210.53407f, 151.21407f, 213.66f, 154.34f),
                    PathNode.Close,
                    PathNode.MoveTo(143.0f, 107.0f),
                    PathNode.CurveTo(144.72655f, 108.2333f, 146.87231f, 108.7302f, 148.96523f, 108.38138f),
                    PathNode.CurveTo(151.05815f, 108.032555f, 152.92677f, 106.86659f, 154.16f, 105.14f),
                    PathNode.LineTo(155.36f, 103.47f),
                    PathNode.CurveTo(165.88106f, 88.755875f, 182.8514f, 80.017525f, 200.94f, 80.0f),
                    PathNode.LineTo(212.69f, 80.0f),
                    PathNode.LineTo(202.34f, 90.34f),
                    PathNode.CurveTo(199.21407f, 93.465935f, 199.21407f, 98.534065f, 202.34f, 101.66f),
                    PathNode.CurveTo(205.46593f, 104.785934f, 210.53407f, 104.785934f, 213.66f, 101.66f),
                    PathNode.LineTo(237.66f, 77.66f),
                    PathNode.CurveTo(239.16223f, 76.159454f, 240.00629f, 74.123276f, 240.00629f, 72.0f),
                    PathNode.CurveTo(240.00629f, 69.876724f, 239.16223f, 67.840546f, 237.66f, 66.34f),
                    PathNode.LineTo(213.66f, 42.34f),
                    PathNode.CurveTo(210.53407f, 39.21407f, 205.46593f, 39.21407f, 202.34f, 42.34f),
                    PathNode.CurveTo(199.21407f, 45.46593f, 199.21407f, 50.53407f, 202.34f, 53.66f),
                    PathNode.LineTo(212.69f, 64.0f),
                    PathNode.LineTo(200.94f, 64.0f),
                    PathNode.CurveTo(177.69208f, 64.019325f, 155.87904f, 75.24415f, 142.35f, 94.15f),
                    PathNode.LineTo(141.15f, 95.82f),
                    PathNode.CurveTo(139.90935f, 97.54674f, 139.40712f, 99.69633f, 139.75424f, 101.79403f),
                    PathNode.CurveTo(140.10135f, 103.89172f, 141.26926f, 105.76495f, 143.0f, 107.0f),
                    PathNode.Close,
                    PathNode.MoveTo(113.0f, 149.0f),
                    PathNode.CurveTo(111.27345f, 147.7667f, 109.127686f, 147.2698f, 107.03477f, 147.61862f),
                    PathNode.CurveTo(104.94185f, 147.96744f, 103.07323f, 149.1334f, 101.84f, 150.86f),
                    PathNode.LineTo(100.64f, 152.53f),
                    PathNode.CurveTo(90.11895f, 167.24413f, 73.148605f, 175.98247f, 55.06f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 179.58173f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 188.41827f, 27.581722f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(55.06f, 192.0f),
                    PathNode.CurveTo(78.30792f, 191.98068f, 100.12095f, 180.75584f, 113.65f, 161.85f),
                    PathNode.LineTo(114.85f, 160.18f),
                    PathNode.CurveTo(116.09065f, 158.45326f, 116.59288f, 156.30368f, 116.245766f, 154.20598f),
                    PathNode.CurveTo(115.89865f, 152.10828f, 114.73075f, 150.23505f, 113.0f, 149.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
