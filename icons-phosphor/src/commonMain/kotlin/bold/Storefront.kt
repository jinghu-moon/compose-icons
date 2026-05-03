package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorBoldIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 96.0f),
                    PathNode.CurveTo(236.00737f, 94.8849f, 235.85928f, 93.774216f, 235.56f, 92.7f),
                    PathNode.LineTo(221.2f, 42.51f),
                    PathNode.CurveTo(218.72836f, 33.949013f, 210.91054f, 28.040855f, 202.0f, 28.0f),
                    PathNode.LineTo(54.0f, 28.0f),
                    PathNode.CurveTo(45.08946f, 28.040855f, 37.271633f, 33.949013f, 34.8f, 42.51f),
                    PathNode.LineTo(20.46f, 92.7f),
                    PathNode.CurveTo(20.153957f, 93.773254f, 19.999132f, 94.883965f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 112.0f),
                    PathNode.CurveTo(19.997858f, 125.129234f, 25.866877f, 137.57155f, 36.0f, 145.92f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 222.62741f, 41.37258f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(214.62741f, 228.0f, 220.0f, 222.62741f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 145.92f),
                    PathNode.CurveTo(230.13312f, 137.57155f, 236.00215f, 125.129234f, 236.0f, 112.0f),
                    PathNode.LineTo(236.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.05f, 52.0f),
                    PathNode.LineTo(199.0f, 52.0f),
                    PathNode.LineTo(208.14f, 84.0f),
                    PathNode.LineTo(47.91f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.05f, 108.0f),
                    PathNode.LineTo(148.05f, 112.0f),
                    PathNode.CurveTo(148.05f, 123.04569f, 139.09567f, 132.0f, 128.05f, 132.0f),
                    PathNode.CurveTo(117.0043f, 132.0f, 108.05f, 123.04569f, 108.05f, 112.0f),
                    PathNode.LineTo(108.05f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.0f, 128.71f),
                    PathNode.CurveTo(47.379837f, 125.00883f, 43.99774f, 118.72941f, 44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 108.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 123.04569f, 75.04569f, 132.0f, 64.0f, 132.0f),
                    PathNode.CurveTo(60.84437f, 132.00142f, 57.734295f, 131.24704f, 54.93f, 129.8f),
                    PathNode.CurveTo(54.32313f, 129.37558f, 53.67682f, 129.01056f, 53.0f, 128.71f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 155.81f),
                    PathNode.CurveTo(61.32f, 155.93f, 62.65f, 156.0f, 64.0f, 156.0f),
                    PathNode.CurveTo(76.12231f, 156.00389f, 87.70564f, 150.99048f, 96.0f, 142.15f),
                    PathNode.CurveTo(104.296265f, 150.9879f, 115.878265f, 156.00114f, 128.0f, 156.00114f),
                    PathNode.CurveTo(140.12173f, 156.00114f, 151.70374f, 150.9879f, 160.0f, 142.15f),
                    PathNode.CurveTo(168.29436f, 150.99048f, 179.8777f, 156.00389f, 192.0f, 156.0f),
                    PathNode.CurveTo(193.35f, 156.0f, 194.68f, 155.93f, 196.0f, 155.81f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 112.0f),
                    PathNode.CurveTo(212.00226f, 118.72941f, 208.62016f, 125.00883f, 203.0f, 128.71f),
                    PathNode.CurveTo(202.34077f, 129.01402f, 201.71136f, 129.37894f, 201.12f, 129.8f),
                    PathNode.CurveTo(194.91978f, 132.9768f, 187.51324f, 132.69832f, 181.5691f, 129.06488f),
                    PathNode.CurveTo(175.62497f, 125.43145f, 171.99986f, 118.96668f, 172.0f, 112.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _storefront!!
    }

private var _storefront: ImageVector? = null
