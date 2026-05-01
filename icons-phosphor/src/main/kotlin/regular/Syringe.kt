package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorRegularIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 66.34f),
                    PathNode.LineTo(189.66f, 18.34f),
                    PathNode.CurveTo(186.53407f, 15.214068f, 181.46593f, 15.214068f, 178.34f, 18.34f),
                    PathNode.CurveTo(175.21407f, 21.46593f, 175.21407f, 26.53407f, 178.34f, 29.66f),
                    PathNode.LineTo(196.69f, 48.0f),
                    PathNode.LineTo(168.0f, 76.69f),
                    PathNode.LineTo(133.66f, 42.34f),
                    PathNode.CurveTo(130.53407f, 39.21407f, 125.465935f, 39.21407f, 122.34f, 42.34f),
                    PathNode.CurveTo(119.214066f, 45.46593f, 119.214066f, 50.53407f, 122.34f, 53.66f),
                    PathNode.LineTo(128.69f, 60.0f),
                    PathNode.LineTo(44.69f, 144.0f),
                    PathNode.CurveTo(41.67581f, 146.99025f, 39.986435f, 151.06421f, 40.0f, 155.31f),
                    PathNode.LineTo(40.0f, 204.69f),
                    PathNode.LineTo(18.34f, 226.34f),
                    PathNode.CurveTo(15.214068f, 229.46593f, 15.214068f, 234.53407f, 18.34f, 237.66f),
                    PathNode.CurveTo(21.46593f, 240.78593f, 26.53407f, 240.78593f, 29.66f, 237.66f),
                    PathNode.LineTo(51.31f, 216.0f),
                    PathNode.LineTo(100.69f, 216.0f),
                    PathNode.CurveTo(104.93579f, 216.01357f, 109.00975f, 214.32419f, 112.0f, 211.31f),
                    PathNode.LineTo(196.0f, 127.31f),
                    PathNode.LineTo(202.34f, 133.66f),
                    PathNode.CurveTo(205.46593f, 136.78593f, 210.53407f, 136.78593f, 213.66f, 133.66f),
                    PathNode.CurveTo(216.78593f, 130.53407f, 216.78593f, 125.465935f, 213.66f, 122.34f),
                    PathNode.LineTo(179.31f, 88.0f),
                    PathNode.LineTo(208.0f, 59.31f),
                    PathNode.LineTo(226.34f, 77.66f),
                    PathNode.CurveTo(229.46593f, 80.785934f, 234.53407f, 80.785934f, 237.66f, 77.66f),
                    PathNode.CurveTo(240.78593f, 74.534065f, 240.78593f, 69.465935f, 237.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(100.69f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 155.31f),
                    PathNode.LineTo(74.0f, 137.31f),
                    PathNode.LineTo(94.34f, 157.66f),
                    PathNode.CurveTo(97.465935f, 160.78593f, 102.534065f, 160.78593f, 105.66f, 157.66f),
                    PathNode.CurveTo(108.785934f, 154.53407f, 108.785934f, 149.46593f, 105.66f, 146.34f),
                    PathNode.LineTo(85.31f, 126.0f),
                    PathNode.LineTo(98.0f, 113.31f),
                    PathNode.LineTo(118.34f, 133.66f),
                    PathNode.CurveTo(121.465935f, 136.78593f, 126.534065f, 136.78593f, 129.66f, 133.66f),
                    PathNode.CurveTo(132.78593f, 130.53407f, 132.78593f, 125.465935f, 129.66f, 122.34f),
                    PathNode.LineTo(109.31f, 102.0f),
                    PathNode.LineTo(140.0f, 71.31f),
                    PathNode.LineTo(184.69f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _syringe!!
    }

private var _syringe: ImageVector? = null
