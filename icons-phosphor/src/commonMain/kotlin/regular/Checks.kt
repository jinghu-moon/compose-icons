package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorRegularIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.61f, 85.71f),
                    PathNode.LineTo(60.01f, 173.71f),
                    PathNode.CurveTo(56.896824f, 176.77225f, 51.903175f, 176.77225f, 48.79f, 173.71f),
                    PathNode.LineTo(10.39f, 136.0f),
                    PathNode.CurveTo(7.239216f, 132.90169f, 7.196683f, 127.835785f, 10.295f, 124.685f),
                    PathNode.CurveTo(13.393317f, 121.53422f, 18.459215f, 121.49168f, 21.61f, 124.59f),
                    PathNode.LineTo(54.4f, 156.79f),
                    PathNode.LineTo(138.4f, 74.29f),
                    PathNode.CurveTo(141.55354f, 71.19168f, 146.62169f, 71.23645f, 149.72f, 74.39f),
                    PathNode.CurveTo(152.81831f, 77.54355f, 152.77356f, 82.61168f, 149.62f, 85.71f),
                    PathNode.Close,
                    PathNode.MoveTo(245.71f, 74.39f),
                    PathNode.CurveTo(244.22276f, 72.87445f, 242.19403f, 72.01234f, 240.07072f, 71.993576f),
                    PathNode.CurveTo(237.94743f, 71.97482f, 235.90378f, 72.800964f, 234.39f, 74.29f),
                    PathNode.LineTo(150.39f, 156.79f),
                    PathNode.LineTo(131.56f, 138.29f),
                    PathNode.CurveTo(128.40645f, 135.19444f, 123.34055f, 135.24146f, 120.245f, 138.395f),
                    PathNode.CurveTo(117.149445f, 141.54855f, 117.19646f, 146.61444f, 120.35f, 149.71f),
                    PathNode.LineTo(144.78f, 173.71f),
                    PathNode.CurveTo(147.89317f, 176.77225f, 152.88683f, 176.77225f, 156.0f, 173.71f),
                    PathNode.LineTo(245.6f, 85.71f),
                    PathNode.CurveTo(247.11688f, 84.2241f, 247.98082f, 82.196106f, 248.00145f, 80.0728f),
                    PathNode.CurveTo(248.02208f, 77.94949f, 247.19772f, 75.9051f, 245.71f, 74.39f),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
