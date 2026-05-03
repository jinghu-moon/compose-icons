package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorRegularIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 180.0f),
                    PathNode.CurveTo(88.0f, 186.62741f, 82.62742f, 192.0f, 76.0f, 192.0f),
                    PathNode.CurveTo(69.37258f, 192.0f, 64.0f, 186.62741f, 64.0f, 180.0f),
                    PathNode.CurveTo(64.0f, 173.37259f, 69.37258f, 168.0f, 76.0f, 168.0f),
                    PathNode.CurveTo(82.62742f, 168.0f, 88.0f, 173.37259f, 88.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 156.19f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(240.0f, 216.83656f, 232.83656f, 224.0f, 224.0f, 224.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(73.33872f, 224.00165f, 70.68224f, 223.77414f, 68.06f, 223.32f),
                    PathNode.CurveTo(44.244904f, 218.975f, 28.413082f, 196.20811f, 32.63f, 172.37f),
                    PathNode.LineTo(57.63f, 29.24f),
                    PathNode.CurveTo(58.34769f, 25.06293f, 60.699352f, 21.343655f, 64.165215f, 18.904228f),
                    PathNode.CurveTo(67.63108f, 16.464802f, 71.92575f, 15.506093f, 76.1f, 16.24f),
                    PathNode.LineTo(130.84f, 26.0f),
                    PathNode.CurveTo(139.51146f, 27.56274f, 145.28745f, 35.842262f, 143.76f, 44.52f),
                    PathNode.LineTo(131.68f, 113.52f),
                    PathNode.LineTo(199.49f, 89.0f),
                    PathNode.CurveTo(207.7647f, 86.0112f, 216.90007f, 90.26395f, 219.94f, 98.52f),
                    PathNode.LineTo(239.0f, 150.69f),
                    PathNode.CurveTo(239.61227f, 152.4615f, 239.94952f, 154.31636f, 240.0f, 156.19f),
                    PathNode.Close,
                    PathNode.MoveTo(103.0f, 184.87f),
                    PathNode.LineTo(128.0f, 41.74f),
                    PathNode.LineTo(73.46f, 32.0f),
                    PathNode.LineTo(48.46f, 175.1f),
                    PathNode.CurveTo(45.742996f, 190.25159f, 55.766308f, 204.75502f, 70.9f, 207.57f),
                    PathNode.CurveTo(78.088745f, 208.8592f, 85.494286f, 207.21313f, 91.46f, 203.0f),
                    PathNode.CurveTo(97.57822f, 198.74483f, 101.73498f, 192.21431f, 103.0f, 184.87f),
                    PathNode.Close,
                    PathNode.MoveTo(116.78f, 195.0f),
                    PathNode.LineTo(224.0f, 156.11f),
                    PathNode.LineTo(204.92f, 104.0f),
                    PathNode.LineTo(128.5f, 131.7f),
                    PathNode.LineTo(118.72f, 187.62f),
                    PathNode.CurveTo(118.28521f, 190.13087f, 117.63617f, 192.5999f, 116.78f, 195.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 173.12f),
                    PathNode.LineTo(127.74f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
