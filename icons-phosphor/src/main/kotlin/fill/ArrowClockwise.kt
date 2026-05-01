package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorFillIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 108.41828f, 236.41827f, 112.0f, 232.0f, 112.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(180.76236f, 112.00255f, 177.84236f, 110.05338f, 176.60303f, 107.062325f),
                    PathNode.CurveTo(175.36368f, 104.07126f, 176.04936f, 100.62809f, 178.34f, 98.34f),
                    PathNode.LineTo(195.34f, 81.34f),
                    PathNode.LineTo(184.79f, 71.69f),
                    PathNode.LineTo(184.54f, 71.45f),
                    PathNode.CurveTo(153.50902f, 40.430767f, 103.28396f, 40.193542f, 71.961334f, 70.91826f),
                    PathNode.CurveTo(40.638718f, 101.64298f, 39.908035f, 151.86328f, 70.323524f, 183.48627f),
                    PathNode.CurveTo(100.739006f, 215.10925f, 150.9497f, 216.33331f, 182.87f, 186.23f),
                    PathNode.CurveTo(186.08154f, 183.19243f, 191.14743f, 183.33347f, 194.185f, 186.545f),
                    PathNode.CurveTo(197.22256f, 189.75653f, 197.08154f, 194.82243f, 193.87f, 197.86f),
                    PathNode.CurveTo(176.08192f, 214.70427f, 152.49779f, 224.06346f, 128.0f, 224.0f),
                    PathNode.LineTo(126.68f, 224.0f),
                    PathNode.CurveTo(83.41898f, 223.40747f, 45.899727f, 193.95045f, 35.05784f, 152.06586f),
                    PathNode.CurveTo(24.215944f, 110.18126f, 42.73071f, 66.21975f, 80.27096f, 44.7117f),
                    PathNode.CurveTo(117.8112f, 23.20365f, 165.09985f, 29.464205f, 195.75f, 60.0f),
                    PathNode.LineTo(206.68f, 70.0f),
                    PathNode.LineTo(226.34f, 50.3f),
                    PathNode.CurveTo(228.63322f, 48.004112f, 232.08617f, 47.320927f, 235.0809f, 48.570557f),
                    PathNode.CurveTo(238.07562f, 49.820187f, 240.01883f, 52.75506f, 240.0f, 56.0f),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
