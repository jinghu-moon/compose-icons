package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorBoldIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.47f, 38.53f),
                    PathNode.CurveTo(205.0744f, 26.091269f, 185.51299f, 24.410852f, 171.17755f, 34.55326f),
                    PathNode.CurveTo(156.84212f, 44.69567f, 151.91609f, 63.70112f, 159.52f, 79.53f),
                    PathNode.LineTo(79.52f, 159.53f),
                    PathNode.CurveTo(65.74858f, 152.95535f, 49.32989f, 155.75854f, 38.52f, 166.53f),
                    PathNode.LineTo(38.52f, 166.53f),
                    PathNode.CurveTo(25.602594f, 179.48503f, 24.455683f, 200.06818f, 35.853863f, 214.37808f),
                    PathNode.CurveTo(47.252045f, 228.68799f, 67.570305f, 232.17363f, 83.08619f, 222.48087f),
                    PathNode.CurveTo(98.602066f, 212.78812f, 104.38098f, 192.99959f, 96.52f, 176.48f),
                    PathNode.LineTo(176.52f, 96.48f),
                    PathNode.CurveTo(192.34888f, 104.083916f, 211.35432f, 99.15788f, 221.49673f, 84.82245f),
                    PathNode.CurveTo(231.63914f, 70.48702f, 229.95872f, 50.925606f, 217.52f, 38.53f),
                    PathNode.Close,
                    PathNode.MoveTo(72.47f, 200.53f),
                    PathNode.CurveTo(67.77942f, 205.20432f, 60.18902f, 205.19554f, 55.509274f, 200.51036f),
                    PathNode.CurveTo(50.829525f, 195.82521f, 50.829525f, 188.2348f, 55.509274f, 183.54964f),
                    PathNode.CurveTo(60.18902f, 178.86447f, 67.77942f, 178.85568f, 72.47f, 183.53f),
                    PathNode.CurveTo(77.15868f, 188.21347f, 77.163155f, 195.811f, 72.48f, 200.5f),
                    PathNode.Close,
                    PathNode.MoveTo(200.47f, 72.53f),
                    PathNode.CurveTo(198.21838f, 74.78945f, 195.15982f, 76.05946f, 191.97f, 76.05946f),
                    PathNode.CurveTo(188.78018f, 76.05946f, 185.72162f, 74.78945f, 183.47f, 72.53f),
                    PathNode.LineTo(183.47f, 72.53f),
                    PathNode.CurveTo(178.79568f, 67.839424f, 178.80446f, 60.24902f, 183.48964f, 55.56927f),
                    PathNode.CurveTo(188.17479f, 50.889526f, 195.7652f, 50.889526f, 200.45036f, 55.56927f),
                    PathNode.CurveTo(205.13553f, 60.24902f, 205.14432f, 67.839424f, 200.47f, 72.53f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
