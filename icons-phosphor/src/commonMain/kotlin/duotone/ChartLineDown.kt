package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorDuotoneIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(216.83656f, 48.0f, 224.0f, 55.163445f, 224.0f, 64.0f),
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
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 43.581722f, 27.581722f, 40.0f, 32.0f, 40.0f),
                    PathNode.CurveTo(36.418278f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 60.69f),
                    PathNode.LineTo(96.0f, 116.69f),
                    PathNode.LineTo(122.34f, 90.34f),
                    PathNode.CurveTo(123.840546f, 88.83778f, 125.876724f, 87.993706f, 128.0f, 87.993706f),
                    PathNode.CurveTo(130.12328f, 87.993706f, 132.15945f, 88.83778f, 133.66f, 90.34f),
                    PathNode.LineTo(192.0f, 148.69f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 123.58172f, 195.58173f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(204.41827f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(208.01524f, 168.26645f, 208.01524f, 168.53355f, 208.0f, 168.8f),
                    PathNode.CurveTo(208.0f, 168.91f, 208.0f, 169.01f, 207.95f, 169.12f),
                    PathNode.CurveTo(207.9f, 169.23f, 207.95f, 169.42f, 207.88f, 169.58f),
                    PathNode.CurveTo(207.85834f, 169.70522f, 207.82828f, 169.82883f, 207.79f, 169.95f),
                    PathNode.CurveTo(207.79f, 170.08f, 207.73f, 170.21f, 207.69f, 170.34f),
                    PathNode.CurveTo(207.65f, 170.47f, 207.61f, 170.57f, 207.57f, 170.69f),
                    PathNode.LineTo(207.43f, 171.08f),
                    PathNode.LineTo(207.28f, 171.39f),
                    PathNode.CurveTo(207.22f, 171.52f, 207.16f, 171.66f, 207.09f, 171.79f),
                    PathNode.CurveTo(207.02f, 171.92f, 206.98f, 171.97f, 206.93f, 172.07f),
                    PathNode.LineTo(206.69f, 172.46f),
                    PathNode.LineTo(206.48f, 172.74f),
                    PathNode.LineTo(206.22f, 173.09f),
                    PathNode.CurveTo(206.11f, 173.23f, 205.98f, 173.36f, 205.86f, 173.49f),
                    PathNode.LineTo(205.7f, 173.67f),
                    PathNode.LineTo(205.53f, 173.82f),
                    PathNode.CurveTo(205.39726f, 173.95135f, 205.25703f, 174.07489f, 205.11f, 174.19f),
                    PathNode.CurveTo(205.00772f, 174.27881f, 204.90091f, 174.36224f, 204.79f, 174.44f),
                    PathNode.LineTo(204.49f, 174.66f),
                    PathNode.LineTo(204.11f, 174.89f),
                    PathNode.CurveTo(204.01344f, 174.95255f, 203.91327f, 175.00931f, 203.81f, 175.06f),
                    PathNode.LineTo(203.44f, 175.25f),
                    PathNode.LineTo(203.1f, 175.4f),
                    PathNode.LineTo(202.74f, 175.53f),
                    PathNode.CurveTo(202.61656f, 175.58224f, 202.48958f, 175.62569f, 202.36f, 175.66f),
                    PathNode.LineTo(202.0f, 175.76f),
                    PathNode.CurveTo(201.86f, 175.76f, 201.74f, 175.83f, 201.6f, 175.85f),
                    PathNode.LineTo(201.18f, 175.92f),
                    PathNode.LineTo(200.83f, 175.97f),
                    PathNode.CurveTo(200.56688f, 175.98488f, 200.30312f, 175.98488f, 200.04f, 175.97f),
                    PathNode.LineTo(160.0f, 175.97f),
                    PathNode.CurveTo(155.58173f, 175.97f, 152.0f, 172.38828f, 152.0f, 167.97f),
                    PathNode.CurveTo(152.0f, 163.55173f, 155.58173f, 159.97f, 160.0f, 159.97f),
                    PathNode.LineTo(180.69f, 159.97f),
                    PathNode.LineTo(128.0f, 107.31f),
                    PathNode.LineTo(101.66f, 133.66f),
                    PathNode.CurveTo(100.159454f, 135.16223f, 98.123276f, 136.00629f, 96.0f, 136.00629f),
                    PathNode.CurveTo(93.876724f, 136.00629f, 91.840546f, 135.16223f, 90.34f, 133.66f),
                    PathNode.LineTo(40.0f, 83.31f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
