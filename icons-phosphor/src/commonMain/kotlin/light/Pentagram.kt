package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorLightIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.29f, 91.67f),
                    PathNode.CurveTo(235.47185f, 85.87244f, 230.07573f, 81.946144f, 224.0f, 82.0f),
                    PathNode.LineTo(161.48f, 82.0f),
                    PathNode.LineTo(141.33f, 19.87f),
                    PathNode.CurveTo(139.54895f, 14.01184f, 134.1514f, 10.003503f, 128.02849f, 9.992011f),
                    PathNode.CurveTo(121.90558f, 9.980518f, 116.49303f, 13.968566f, 114.69f, 19.82f),
                    PathNode.LineTo(94.51f, 82.0f),
                    PathNode.LineTo(32.0f, 82.0f),
                    PathNode.CurveTo(25.92482f, 81.994f, 20.539095f, 85.90682f, 18.667269f, 91.686455f),
                    PathNode.CurveTo(16.795444f, 97.46608f, 18.86476f, 103.793335f, 23.79f, 107.35f),
                    PathNode.LineTo(74.44f, 143.79f),
                    PathNode.LineTo(55.05f, 203.63f),
                    PathNode.CurveTo(53.108322f, 209.39534f, 55.177006f, 215.75177f, 60.14f, 219.27f),
                    PathNode.CurveTo(65.016754f, 222.8952f, 71.693245f, 222.8952f, 76.57f, 219.27f),
                    PathNode.LineTo(128.0f, 182.27f),
                    PathNode.LineTo(179.41f, 219.27f),
                    PathNode.CurveTo(184.31386f, 222.86966f, 190.98105f, 222.89062f, 195.90747f, 219.32188f),
                    PathNode.CurveTo(200.83388f, 215.75316f, 202.89195f, 209.41151f, 201.0f, 203.63f),
                    PathNode.LineTo(181.58f, 143.78f),
                    PathNode.LineTo(232.25f, 107.32f),
                    PathNode.CurveTo(237.1962f, 103.78472f, 239.24356f, 97.427315f, 237.29f, 91.67f),
                    PathNode.Close,
                    PathNode.MoveTo(126.11f, 23.49f),
                    PathNode.CurveTo(126.30515f, 22.599783f, 127.09364f, 21.965422f, 128.005f, 21.965422f),
                    PathNode.CurveTo(128.91635f, 21.965422f, 129.70485f, 22.599783f, 129.9f, 23.49f),
                    PathNode.LineTo(148.9f, 81.95f),
                    PathNode.LineTo(107.13f, 81.95f),
                    PathNode.Close,
                    PathNode.MoveTo(30.85f, 97.61f),
                    PathNode.CurveTo(30.109348f, 97.13328f, 29.804626f, 96.202415f, 30.12f, 95.38f),
                    PathNode.CurveTo(30.351168f, 94.53993f, 31.129263f, 93.96877f, 32.0f, 94.0f),
                    PathNode.LineTo(90.62f, 94.0f),
                    PathNode.LineTo(78.36f, 131.8f),
                    PathNode.Close,
                    PathNode.MoveTo(69.54f, 209.61f),
                    PathNode.CurveTo(68.83849f, 210.12282f, 67.88612f, 210.12398f, 67.18336f, 209.61288f),
                    PathNode.CurveTo(66.4806f, 209.10179f, 66.18827f, 208.19539f, 66.46f, 207.37f),
                    PathNode.LineTo(66.46f, 207.37f),
                    PathNode.LineTo(84.69f, 151.17f),
                    PathNode.LineTo(117.69f, 174.94f),
                    PathNode.Close,
                    PathNode.MoveTo(88.54f, 139.19f),
                    PathNode.LineTo(103.24f, 94.0f),
                    PathNode.LineTo(152.76f, 94.0f),
                    PathNode.LineTo(167.41f, 139.16f),
                    PathNode.LineTo(128.0f, 167.51f),
                    PathNode.Close,
                    PathNode.MoveTo(189.49f, 207.37f),
                    PathNode.CurveTo(189.7596f, 208.19896f, 189.46123f, 209.10706f, 188.75252f, 209.6146f),
                    PathNode.CurveTo(188.0438f, 210.12212f, 187.088f, 210.11217f, 186.39f, 209.59f),
                    PathNode.LineTo(138.27f, 174.9f),
                    PathNode.LineTo(171.27f, 151.13f),
                    PathNode.Close,
                    PathNode.MoveTo(225.17f, 97.59f),
                    PathNode.LineTo(177.64f, 131.79f),
                    PathNode.LineTo(165.38f, 94.0f),
                    PathNode.LineTo(224.0f, 94.0f),
                    PathNode.CurveTo(224.88329f, 93.95261f, 225.67775f, 94.53382f, 225.9f, 95.39f),
                    PathNode.CurveTo(226.21132f, 96.20361f, 225.90594f, 97.12389f, 225.17f, 97.59f),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
