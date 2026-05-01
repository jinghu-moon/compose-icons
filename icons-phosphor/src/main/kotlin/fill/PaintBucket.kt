package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorFillIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 208.0f),
                    PathNode.CurveTo(256.0f, 221.25484f, 245.25484f, 232.0f, 232.0f, 232.0f),
                    PathNode.CurveTo(218.74516f, 232.0f, 208.0f, 221.25484f, 208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 190.09f, 223.57f, 166.23f, 225.34f, 163.56f),
                    PathNode.CurveTo(226.8232f, 161.3313f, 229.32288f, 159.9922f, 232.0f, 159.9922f),
                    PathNode.CurveTo(234.67712f, 159.9922f, 237.1768f, 161.3313f, 238.66f, 163.56f),
                    PathNode.CurveTo(240.43f, 166.23f, 256.0f, 190.09f, 256.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.49f, 124.49f),
                    PathNode.CurveTo(137.18442f, 119.79558f, 137.18442f, 112.18442f, 132.49f, 107.49f),
                    PathNode.CurveTo(127.79558f, 102.79558f, 120.18442f, 102.79558f, 115.49f, 107.49f),
                    PathNode.LineTo(115.49f, 107.49f),
                    PathNode.CurveTo(115.49f, 107.49f, 115.49f, 107.49f, 115.49f, 107.49f),
                    PathNode.CurveTo(110.875534f, 112.19503f, 110.91887f, 119.74097f, 115.58707f, 124.39269f),
                    PathNode.CurveTo(120.255264f, 129.04442f, 127.801315f, 129.06108f, 132.49f, 124.43f),
                    PathNode.Close,
                    PathNode.MoveTo(37.65f, 18.34f),
                    PathNode.CurveTo(34.524067f, 15.21683f, 29.45817f, 15.219069f, 26.335f, 18.345f),
                    PathNode.CurveTo(23.21183f, 21.470932f, 23.214067f, 26.536827f, 26.34f, 29.66f),
                    PathNode.LineTo(58.94f, 62.26f),
                    PathNode.LineTo(70.25f, 51.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.53f, 139.07f),
                    PathNode.CurveTo(237.1583f, 138.19293f, 239.14561f, 136.01833f, 239.78307f, 133.32188f),
                    PathNode.CurveTo(240.42053f, 130.62543f, 239.61732f, 127.79113f, 237.66f, 125.83f),
                    PathNode.LineTo(122.17f, 10.34f),
                    PathNode.CurveTo(119.046234f, 7.218277f, 113.98377f, 7.218277f, 110.86f, 10.34f),
                    PathNode.LineTo(70.25f, 51.0f),
                    PathNode.LineTo(110.68f, 91.42f),
                    PathNode.CurveTo(122.90668f, 84.80304f, 138.1367f, 88.159195f, 146.44969f, 99.30235f),
                    PathNode.CurveTo(154.7627f, 110.44551f, 153.6407f, 126.00053f, 143.81459f, 135.83533f),
                    PathNode.CurveTo(133.98848f, 145.67014f, 118.43446f, 146.80585f, 107.28396f, 138.5027f),
                    PathNode.CurveTo(96.13346f, 130.19957f, 92.763855f, 114.97252f, 99.37f, 102.74f),
                    PathNode.LineTo(58.94f, 62.26f),
                    PathNode.LineTo(15.0f, 106.17f),
                    PathNode.CurveTo(5.628167f, 115.54246f, 5.628167f, 130.73755f, 15.0f, 140.11f),
                    PathNode.LineTo(99.89f, 225.0f),
                    PathNode.CurveTo(109.26245f, 234.37183f, 124.45754f, 234.37183f, 133.83f, 225.0f),
                    PathNode.LineTo(212.32f, 146.51f),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
