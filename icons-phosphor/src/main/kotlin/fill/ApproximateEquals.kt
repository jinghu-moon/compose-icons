package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorFillIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.2f, 160.87f),
                    PathNode.CurveTo(184.13f, 172.05f, 172.3f, 175.97f, 161.56f, 175.97f),
                    PathNode.CurveTo(147.3f, 175.97f, 134.94f, 169.05f, 124.09f, 162.97f),
                    PathNode.CurveTo(105.68f, 152.66f, 91.14f, 144.52f, 69.2f, 163.28f),
                    PathNode.CurveTo(65.84211f, 166.15189f, 60.79188f, 165.75789f, 57.92f, 162.4f),
                    PathNode.CurveTo(55.04812f, 159.04211f, 55.44211f, 153.99188f, 58.8f, 151.12f),
                    PathNode.CurveTo(89.22f, 125.12f, 112.89f, 138.36f, 131.91f, 149.01f),
                    PathNode.CurveTo(150.32f, 159.32f, 164.91f, 167.46f, 186.8f, 148.7f),
                    PathNode.CurveTo(190.1579f, 145.82812f, 195.20811f, 146.2221f, 198.08f, 149.58f),
                    PathNode.CurveTo(200.95187f, 152.9379f, 200.55789f, 157.98811f, 197.2f, 160.86f),
                    PathNode.Close,
                    PathNode.MoveTo(197.2f, 104.87f),
                    PathNode.CurveTo(184.13f, 116.05f, 172.3f, 119.97f, 161.56f, 119.97f),
                    PathNode.CurveTo(147.3f, 119.97f, 134.94f, 113.05f, 124.09f, 106.97f),
                    PathNode.CurveTo(105.68f, 96.66f, 91.14f, 88.52f, 69.2f, 107.28f),
                    PathNode.CurveTo(65.8318f, 109.99703f, 60.91362f, 109.54315f, 58.099567f, 106.25558f),
                    PathNode.CurveTo(55.285515f, 102.968f, 55.595848f, 98.03868f, 58.8f, 95.13f),
                    PathNode.CurveTo(89.22f, 69.13f, 112.89f, 82.37f, 131.91f, 93.02f),
                    PathNode.CurveTo(150.32f, 103.33f, 164.91f, 111.47f, 186.8f, 92.71f),
                    PathNode.CurveTo(190.1579f, 89.83812f, 195.20811f, 90.23211f, 198.08f, 93.59f),
                    PathNode.CurveTo(200.95187f, 96.94789f, 200.55789f, 101.998116f, 197.2f, 104.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
