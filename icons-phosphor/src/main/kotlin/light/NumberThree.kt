package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorLightIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 160.0f),
                    PathNode.CurveTo(174.0003f, 181.2951f, 161.48538f, 200.60182f, 142.04576f, 209.29565f),
                    PathNode.CurveTo(122.60615f, 217.98947f, 99.87244f, 214.44673f, 84.0f, 200.25f),
                    PathNode.CurveTo(82.34504f, 198.83633f, 81.58544f, 196.63727f, 82.01505f, 194.50354f),
                    PathNode.CurveTo(82.444664f, 192.36981f, 83.99612f, 190.63608f, 86.06921f, 189.97302f),
                    PathNode.CurveTo(88.1423f, 189.30997f, 90.4119f, 189.82161f, 92.0f, 191.31f),
                    PathNode.CurveTo(105.954216f, 203.7865f, 126.480675f, 205.52264f, 142.3322f, 195.56712f),
                    PathNode.CurveTo(158.18373f, 185.61162f, 165.53374f, 166.36772f, 160.35489f, 148.37987f),
                    PathNode.CurveTo(155.17604f, 130.39203f, 138.71852f, 118.00252f, 120.0f, 118.0f),
                    PathNode.CurveTo(117.72737f, 118.0f, 115.64978f, 116.715996f, 114.63344f, 114.68328f),
                    PathNode.CurveTo(113.61709f, 112.65057f, 113.83642f, 110.21811f, 115.2f, 108.4f),
                    PathNode.LineTo(156.0f, 54.0f),
                    PathNode.LineTo(88.0f, 54.0f),
                    PathNode.CurveTo(84.686295f, 54.0f, 82.0f, 51.31371f, 82.0f, 48.0f),
                    PathNode.CurveTo(82.0f, 44.68629f, 84.686295f, 42.0f, 88.0f, 42.0f),
                    PathNode.LineTo(168.0f, 42.0f),
                    PathNode.CurveTo(170.27263f, 42.0f, 172.3502f, 43.284016f, 173.36656f, 45.31672f),
                    PathNode.CurveTo(174.38292f, 47.349422f, 174.16357f, 49.781895f, 172.8f, 51.6f),
                    PathNode.LineTo(131.13f, 107.15f),
                    PathNode.CurveTo(156.09787f, 112.44817f, 173.9662f, 134.47621f, 174.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
