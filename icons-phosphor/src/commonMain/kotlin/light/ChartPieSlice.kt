package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorLightIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(102.0f, 109.5f),
                    PathNode.LineTo(102.0f, 37.5f),
                    PathNode.CurveTo(102.00102f, 35.551636f, 101.05592f, 33.724087f, 99.465385f, 32.59878f),
                    PathNode.CurveTo(97.87485f, 31.473476f, 95.83694f, 31.190544f, 94.0f, 31.84f),
                    PathNode.CurveTo(46.676903f, 48.567524f, 18.55655f, 97.237366f, 27.7f, 146.59f),
                    PathNode.CurveTo(28.05304f, 148.50717f, 29.31547f, 150.13332f, 31.085274f, 150.9506f),
                    PathNode.CurveTo(32.855076f, 151.7679f, 34.91162f, 151.67444f, 36.6f, 150.7f),
                    PathNode.LineTo(99.0f, 114.7f),
                    PathNode.CurveTo(100.8576f, 113.62752f, 102.00137f, 111.644966f, 102.0f, 109.5f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 106.0f),
                    PathNode.LineTo(38.34f, 135.8f),
                    PathNode.QuadTo(38.0f, 131.91f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.026417f, 93.017746f, 58.2993f, 61.21271f, 90.0f, 46.42f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(124.686295f, 26.0f, 122.0f, 28.68629f, 122.0f, 32.0f),
                    PathNode.LineTo(122.0f, 125.0f),
                    PathNode.LineTo(42.2f, 171.46f),
                    PathNode.CurveTo(40.823227f, 172.26343f, 39.822758f, 173.58171f, 39.419388f, 175.12389f),
                    PathNode.CurveTo(39.01602f, 176.66606f, 39.242916f, 178.30536f, 40.05f, 179.68f),
                    PathNode.CurveTo(65.07908f, 222.2694f, 117.03f, 240.8017f, 163.36348f, 223.66928f),
                    PathNode.CurveTo(209.69696f, 206.53685f, 237.0939f, 158.66461f, 228.39435f, 110.03716f),
                    PathNode.CurveTo(219.6948f, 61.409718f, 177.3995f, 26.005575f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(98.25203f, 217.92076f, 70.4436f, 203.22395f, 53.62f, 178.69f),
                    PathNode.LineTo(131.0f, 133.61f),
                    PathNode.CurveTo(132.8545f, 132.5393f, 133.9978f, 130.5614f, 134.0f, 128.42f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(182.43062f, 41.4341f, 219.57211f, 82.49018f, 217.95326f, 131.00166f),
                    PathNode.CurveTo(216.33441f, 179.51315f, 176.53848f, 218.0018f, 128.0f, 218.0f),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
