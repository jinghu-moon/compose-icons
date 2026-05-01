package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorBoldIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(140.9543f, 28.0f, 132.0f, 36.954304f, 132.0f, 48.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(58.16f, 100.0f),
                    PathNode.CurveTo(52.899975f, 83.34877f, 37.462265f, 72.02132f, 20.0f, 72.0f),
                    PathNode.CurveTo(13.372583f, 72.0f, 8.0f, 77.37258f, 8.0f, 84.0f),
                    PathNode.CurveTo(8.0f, 90.62742f, 13.372583f, 96.0f, 20.0f, 96.0f),
                    PathNode.CurveTo(28.836555f, 96.0f, 36.0f, 103.163445f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.049603f, 158.37135f, 73.62865f, 195.9504f, 120.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(206.39192f, 196.0f, 244.0f, 158.39192f, 244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 65.60808f, 206.39192f, 28.0f, 160.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.06f, 76.12f),
                    PathNode.CurveTo(213.3629f, 83.18603f, 217.02805f, 91.34292f, 218.79f, 100.0f),
                    PathNode.LineTo(178.21f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 52.0f),
                    PathNode.CurveTo(170.47314f, 52.00215f, 180.76122f, 54.76127f, 189.83f, 60.0f),
                    PathNode.LineTo(156.0f, 87.0f),
                    PathNode.LineTo(156.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 172.0f),
                    PathNode.LineTo(120.0f, 172.0f),
                    PathNode.CurveTo(91.50144f, 171.96237f, 66.947624f, 151.91502f, 61.21f, 124.0f),
                    PathNode.LineTo(218.79f, 124.0f),
                    PathNode.CurveTo(213.05237f, 151.91502f, 188.49855f, 171.96237f, 160.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 224.0f),
                    PathNode.CurveTo(108.0f, 235.0457f, 99.04569f, 244.0f, 88.0f, 244.0f),
                    PathNode.CurveTo(76.95431f, 244.0f, 68.0f, 235.0457f, 68.0f, 224.0f),
                    PathNode.CurveTo(68.0f, 212.9543f, 76.95431f, 204.0f, 88.0f, 204.0f),
                    PathNode.CurveTo(99.04569f, 204.0f, 108.0f, 212.9543f, 108.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 224.0f),
                    PathNode.CurveTo(212.0f, 235.0457f, 203.0457f, 244.0f, 192.0f, 244.0f),
                    PathNode.CurveTo(180.9543f, 244.0f, 172.0f, 235.0457f, 172.0f, 224.0f),
                    PathNode.CurveTo(172.0f, 212.9543f, 180.9543f, 204.0f, 192.0f, 204.0f),
                    PathNode.CurveTo(203.0457f, 204.0f, 212.0f, 212.9543f, 212.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
