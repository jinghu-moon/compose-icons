package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorThinIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.LineTo(228.0f, 196.0f),
                    PathNode.LineTo(228.0f, 118.08f),
                    PathNode.LineTo(236.74f, 130.33f),
                    PathNode.CurveTo(237.49298f, 131.38074f, 238.70732f, 132.0028f, 240.0f, 132.0f),
                    PathNode.CurveTo(241.49573f, 131.99684f, 242.86473f, 131.15944f, 243.54875f, 129.82927f),
                    PathNode.CurveTo(244.23279f, 128.49911f, 244.11754f, 126.89845f, 243.25f, 125.68f),
                    PathNode.LineTo(203.25f, 69.68f),
                    PathNode.CurveTo(202.98273f, 69.28657f, 202.64343f, 68.947266f, 202.25f, 68.68f),
                    PathNode.LineTo(134.66f, 22.0f),
                    PathNode.CurveTo(130.61612f, 19.287306f, 125.33388f, 19.287306f, 121.29f, 22.0f),
                    PathNode.LineTo(53.73f, 68.71f),
                    PathNode.CurveTo(53.33657f, 68.97727f, 52.99727f, 69.316574f, 52.73f, 69.71f),
                    PathNode.LineTo(12.73f, 125.71f),
                    PathNode.CurveTo(11.445938f, 127.50769f, 11.862313f, 130.00594f, 13.66f, 131.29f),
                    PathNode.CurveTo(15.457686f, 132.57407f, 17.955938f, 132.15768f, 19.24f, 130.36f),
                    PathNode.LineTo(28.0f, 118.08f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.LineTo(16.0f, 196.0f),
                    PathNode.CurveTo(13.790861f, 196.0f, 12.0f, 197.79086f, 12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 202.20914f, 13.790861f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 202.20914f, 244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 197.79086f, 242.20914f, 196.0f, 240.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 106.88f),
                    PathNode.LineTo(58.85f, 74.88f),
                    PathNode.LineTo(125.78f, 28.65f),
                    PathNode.CurveTo(127.11028f, 27.77963f, 128.82971f, 27.77963f, 130.16f, 28.65f),
                    PathNode.LineTo(197.16f, 74.91f),
                    PathNode.LineTo(220.01f, 106.91f),
                    PathNode.LineTo(220.01f, 196.0f),
                    PathNode.LineTo(188.0f, 196.0f),
                    PathNode.LineTo(188.0f, 120.0f),
                    PathNode.CurveTo(188.0f, 117.79086f, 186.20914f, 116.0f, 184.0f, 116.0f),
                    PathNode.LineTo(72.0f, 116.0f),
                    PathNode.CurveTo(69.79086f, 116.0f, 68.0f, 117.79086f, 68.0f, 120.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 155.08f),
                    PathNode.LineTo(84.48f, 124.0f),
                    PathNode.LineTo(171.48f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 127.77f),
                    PathNode.LineTo(180.0f, 192.23f),
                    PathNode.LineTo(134.88f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(121.12f, 160.0f),
                    PathNode.LineTo(76.0f, 192.23f),
                    PathNode.LineTo(76.0f, 127.77f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.92f),
                    PathNode.LineTo(171.52f, 196.0f),
                    PathNode.LineTo(84.52f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 85.79086f, 109.79086f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(144.0f, 84.0f),
                    PathNode.CurveTo(146.20914f, 84.0f, 148.0f, 85.79086f, 148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 90.20914f, 146.20914f, 92.0f, 144.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(109.79086f, 92.0f, 108.0f, 90.20914f, 108.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _barn!!
    }

private var _barn: ImageVector? = null
