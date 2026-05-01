package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorBoldIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.79f, 52.62f),
                    PathNode.LineTo(131.79f, 20.62f),
                    PathNode.CurveTo(129.33148f, 19.790098f, 126.66852f, 19.790098f, 124.21f, 20.62f),
                    PathNode.LineTo(28.21f, 52.62f),
                    PathNode.CurveTo(23.522062f, 54.172634f, 20.263987f, 58.438698f, 20.0f, 63.37f),
                    PathNode.CurveTo(19.98906f, 63.579857f, 19.98906f, 63.790146f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 144.0f),
                    PathNode.CurveTo(20.0f, 150.62741f, 25.372583f, 156.0f, 32.0f, 156.0f),
                    PathNode.CurveTo(38.62742f, 156.0f, 44.0f, 150.62741f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 80.65f),
                    PathNode.LineTo(67.71f, 88.55f),
                    PathNode.CurveTo(52.52559f, 117.61491f, 60.27575f, 153.37842f, 86.13f, 173.55f),
                    PathNode.CurveTo(69.73425f, 181.63516f, 55.858276f, 194.04504f, 46.0f, 209.44f),
                    PathNode.CurveTo(43.583908f, 213.03096f, 43.288746f, 217.64474f, 45.22756f, 221.5143f),
                    PathNode.CurveTo(47.16637f, 225.38387f, 51.03871f, 227.90956f, 55.361496f, 228.12405f),
                    PathNode.CurveTo(59.684284f, 228.33855f, 63.787636f, 226.20862f, 66.1f, 222.55f),
                    PathNode.CurveTo(80.37f, 200.59f, 103.0f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(153.0f, 188.0f, 175.63f, 200.59f, 189.95f, 222.55f),
                    PathNode.CurveTo(192.26236f, 226.20862f, 196.36572f, 228.33855f, 200.6885f, 228.12405f),
                    PathNode.CurveTo(205.01129f, 227.90956f, 208.88362f, 225.38387f, 210.82245f, 221.5143f),
                    PathNode.CurveTo(212.76126f, 217.64474f, 212.4661f, 213.03096f, 210.05f, 209.44f),
                    PathNode.CurveTo(200.18227f, 194.02713f, 186.28789f, 181.60588f, 169.87f, 173.52f),
                    PathNode.CurveTo(195.72424f, 153.3484f, 203.47441f, 117.58491f, 188.29f, 88.52f),
                    PathNode.LineTo(227.79f, 75.35f),
                    PathNode.CurveTo(232.68367f, 73.71277f, 235.9827f, 69.13029f, 235.9827f, 63.97f),
                    PathNode.CurveTo(235.9827f, 58.809715f, 232.68367f, 54.227234f, 227.79f, 52.59f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.62f),
                    PathNode.LineTo(186.05f, 64.0f),
                    PathNode.LineTo(128.0f, 83.35f),
                    PathNode.LineTo(70.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 120.0f),
                    PathNode.CurveTo(172.00352f, 138.74454f, 160.13133f, 155.43333f, 142.42236f, 161.57744f),
                    PathNode.CurveTo(124.713394f, 167.72154f, 105.05619f, 161.97182f, 93.44963f, 147.25294f),
                    PathNode.CurveTo(81.84307f, 132.53406f, 80.83573f, 112.07801f, 90.94f, 96.29f),
                    PathNode.LineTo(124.21f, 107.38f),
                    PathNode.CurveTo(126.66901f, 108.206955f, 129.331f, 108.206955f, 131.79f, 107.38f),
                    PathNode.LineTo(165.06f, 96.29f),
                    PathNode.CurveTo(169.59789f, 103.364876f, 172.00684f, 111.59488f, 172.0f, 120.0f),
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
        return _student!!
    }

private var _student: ImageVector? = null
