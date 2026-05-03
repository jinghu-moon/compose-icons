package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorBoldIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.49f, 164.55f),
                    PathNode.LineTo(255.49f, 164.55f),
                    PathNode.LineTo(255.49f, 164.49f),
                    PathNode.CurveTo(255.49469f, 164.46019f, 255.49469f, 164.42982f, 255.49f, 164.4f),
                    PathNode.LineTo(233.2f, 90.25f),
                    PathNode.CurveTo(230.69888f, 81.76783f, 222.89314f, 75.95937f, 214.05f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.CurveTo(197.37259f, 76.0f, 192.0f, 81.37258f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 94.62742f, 197.37259f, 100.0f, 204.0f, 100.0f),
                    PathNode.LineTo(211.07f, 100.0f),
                    PathNode.LineTo(227.87f, 156.0f),
                    PathNode.LineTo(196.93f, 156.0f),
                    PathNode.LineTo(177.2f, 90.25f),
                    PathNode.CurveTo(174.69888f, 81.76783f, 166.89314f, 75.95937f, 158.05f, 76.0f),
                    PathNode.LineTo(148.0f, 76.0f),
                    PathNode.CurveTo(141.37259f, 76.0f, 136.0f, 81.37258f, 136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 94.62742f, 141.37259f, 100.0f, 148.0f, 100.0f),
                    PathNode.LineTo(155.07f, 100.0f),
                    PathNode.LineTo(171.87f, 156.0f),
                    PathNode.LineTo(140.93f, 156.0f),
                    PathNode.LineTo(121.2f, 90.25f),
                    PathNode.CurveTo(118.69889f, 81.76783f, 110.893135f, 75.95937f, 102.05f, 76.0f),
                    PathNode.LineTo(42.0f, 76.0f),
                    PathNode.CurveTo(33.138382f, 75.93703f, 25.306246f, 81.74995f, 22.8f, 90.25f),
                    PathNode.LineTo(0.55f, 164.4f),
                    PathNode.CurveTo(0.545316f, 164.42982f, 0.545316f, 164.46019f, 0.55f, 164.49f),
                    PathNode.LineTo(0.55f, 164.55f),
                    PathNode.CurveTo(0.485051f, 164.7535f, 0.431633f, 164.9605f, 0.39f, 165.17f),
                    PathNode.CurveTo(-0.475936f, 168.7381f, 0.339292f, 172.50627f, 2.602646f, 175.39735f),
                    PathNode.CurveTo(4.865999f, 178.28844f, 8.328365f, 179.98424f, 12.0f, 180.0f),
                    PathNode.LineTo(244.0f, 180.0f),
                    PathNode.CurveTo(247.79301f, 179.99893f, 251.36223f, 178.20465f, 253.62572f, 175.16106f),
                    PathNode.CurveTo(255.88922f, 172.11745f, 256.5805f, 168.18288f, 255.49f, 164.55f),
                    PathNode.Close,
                    PathNode.MoveTo(44.93f, 100.0f),
                    PathNode.LineTo(99.07f, 100.0f),
                    PathNode.LineTo(115.87f, 156.0f),
                    PathNode.LineTo(28.13f, 156.0f),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
