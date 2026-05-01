package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorThinIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 160.0f),
                    PathNode.CurveTo(172.00177f, 180.50789f, 159.94997f, 199.10146f, 141.22891f, 207.47375f),
                    PathNode.CurveTo(122.50786f, 215.84607f, 100.6145f, 212.43324f, 85.33f, 198.76f),
                    PathNode.CurveTo(83.67315f, 197.2854f, 83.5254f, 194.74686f, 85.0f, 193.09f),
                    PathNode.CurveTo(86.4746f, 191.43315f, 89.013145f, 191.2854f, 90.67f, 192.76f),
                    PathNode.CurveTo(105.28062f, 205.8601f, 126.800156f, 207.7014f, 143.42389f, 197.27383f),
                    PathNode.CurveTo(160.04762f, 186.84627f, 167.75668f, 166.67076f, 162.3222f, 147.81474f),
                    PathNode.CurveTo(156.88773f, 128.95874f, 139.62352f, 115.98077f, 120.0f, 116.0f),
                    PathNode.CurveTo(118.48491f, 116.0f, 117.09986f, 115.14399f, 116.422295f, 113.78886f),
                    PathNode.CurveTo(115.74472f, 112.43371f, 115.890945f, 110.81207f, 116.8f, 109.6f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.LineTo(88.0f, 52.0f),
                    PathNode.CurveTo(85.79086f, 52.0f, 84.0f, 50.20914f, 84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 45.79086f, 85.79086f, 44.0f, 88.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(169.51509f, 44.0f, 170.90015f, 44.85601f, 171.57771f, 46.211147f),
                    PathNode.CurveTo(172.25528f, 47.56628f, 172.10905f, 49.18793f, 171.2f, 50.4f),
                    PathNode.LineTo(127.59f, 108.55f),
                    PathNode.CurveTo(153.0861f, 112.346275f, 171.96925f, 134.22284f, 172.0f, 160.0f),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
