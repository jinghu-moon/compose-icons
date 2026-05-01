package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorFillIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.44f, 73.34f),
                    PathNode.LineTo(213.21f, 57.86f),
                    PathNode.CurveTo(205.30234f, 32.928547f, 182.15547f, 15.992213f, 156.0f, 16.0f),
                    PathNode.LineTo(155.71f, 16.0f),
                    PathNode.CurveTo(122.79f, 16.16f, 96.0f, 43.47f, 96.0f, 76.89f),
                    PathNode.LineTo(96.0f, 96.63f),
                    PathNode.LineTo(11.63f, 197.88f),
                    PathNode.LineTo(11.53f, 198.0f),
                    PathNode.CurveTo(7.687492f, 202.79929f, 6.934753f, 209.3758f, 9.593453f, 214.9192f),
                    PathNode.CurveTo(12.252153f, 220.4626f, 17.852f, 223.99232f, 24.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(169.41248f, 223.93938f, 215.93938f, 177.41248f, 216.0f, 120.0f),
                    PathNode.LineTo(216.0f, 100.28f),
                    PathNode.LineTo(236.44f, 86.66f),
                    PathNode.CurveTo(238.6687f, 85.1768f, 240.0078f, 82.67713f, 240.0078f, 80.0f),
                    PathNode.CurveTo(240.0078f, 77.32287f, 238.6687f, 74.8232f, 236.44f, 73.34f),
                    PathNode.Close,
                    PathNode.MoveTo(126.15f, 133.12f),
                    PathNode.LineTo(66.15f, 205.12f),
                    PathNode.CurveTo(64.34047f, 207.38042f, 61.45076f, 208.48665f, 58.594364f, 208.0124f),
                    PathNode.CurveTo(55.73797f, 207.53816f, 53.360767f, 205.55746f, 52.378777f, 202.83359f),
                    PathNode.CurveTo(51.396786f, 200.1097f, 51.96329f, 197.06778f, 53.86f, 194.88f),
                    PathNode.LineTo(113.86f, 122.88f),
                    PathNode.CurveTo(115.669525f, 120.619576f, 118.55924f, 119.51335f, 121.415634f, 119.987595f),
                    PathNode.CurveTo(124.27203f, 120.46184f, 126.64923f, 122.44251f, 127.631226f, 125.16641f),
                    PathNode.CurveTo(128.61322f, 127.890305f, 128.0467f, 130.93222f, 126.15f, 133.12f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 80.0f),
                    PathNode.CurveTo(157.37259f, 80.0f, 152.0f, 74.62742f, 152.0f, 68.0f),
                    PathNode.CurveTo(152.0f, 61.37258f, 157.37259f, 56.0f, 164.0f, 56.0f),
                    PathNode.CurveTo(170.62741f, 56.0f, 176.0f, 61.37258f, 176.0f, 68.0f),
                    PathNode.CurveTo(176.0f, 74.62742f, 170.62741f, 80.0f, 164.0f, 80.0f),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
