package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorDuotoneIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 104.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 98.73f),
                    PathNode.LineTo(190.0f, 34.73f),
                    PathNode.CurveTo(188.48528f, 33.00001f, 186.2994f, 32.005436f, 184.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(69.70061f, 32.005436f, 67.514725f, 33.00001f, 66.0f, 34.73f),
                    PathNode.LineTo(10.0f, 98.73f),
                    PathNode.CurveTo(7.293628f, 101.81992f, 7.3671f, 106.45736f, 10.17f, 109.46f),
                    PathNode.LineTo(122.17f, 229.46f),
                    PathNode.CurveTo(123.68309f, 231.08209f, 125.80175f, 232.00314f, 128.02f, 232.00314f),
                    PathNode.CurveTo(130.23825f, 232.00314f, 132.35692f, 231.08209f, 133.87f, 229.46f),
                    PathNode.LineTo(245.87f, 109.46f),
                    PathNode.CurveTo(248.66135f, 106.447014f, 248.71753f, 101.80973f, 246.0f, 98.73f),
                    PathNode.Close,
                    PathNode.MoveTo(222.37f, 96.0f),
                    PathNode.LineTo(180.0f, 96.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.LineTo(180.37f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.58f, 112.0f),
                    PathNode.LineTo(104.71f, 187.33f),
                    PathNode.LineTo(34.41f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.18f, 112.0f),
                    PathNode.LineTo(128.0f, 202.46f),
                    PathNode.LineTo(91.82f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 96.0f),
                    PathNode.LineTo(128.0f, 53.33f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.42f, 112.0f),
                    PathNode.LineTo(221.59f, 112.0f),
                    PathNode.LineTo(151.29f, 187.33f),
                    PathNode.Close,
                    PathNode.MoveTo(75.63f, 48.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.LineTo(76.0f, 96.0f),
                    PathNode.LineTo(33.63f, 96.0f),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
