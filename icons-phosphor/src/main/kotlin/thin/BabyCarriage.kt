package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorThinIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(145.37259f, 36.0f, 140.0f, 41.37258f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 108.0f),
                    PathNode.LineTo(51.77f, 108.0f),
                    PathNode.CurveTo(49.73315f, 89.781845f, 34.33166f, 76.00361f, 16.0f, 76.0f),
                    PathNode.CurveTo(13.790861f, 76.0f, 12.0f, 77.79086f, 12.0f, 80.0f),
                    PathNode.CurveTo(12.0f, 82.20914f, 13.790861f, 84.0f, 16.0f, 84.0f),
                    PathNode.CurveTo(31.463972f, 84.0f, 44.0f, 96.536026f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.044098f, 153.95538f, 78.04464f, 187.9559f, 120.0f, 188.0f),
                    PathNode.LineTo(160.0f, 188.0f),
                    PathNode.CurveTo(201.97365f, 188.0f, 236.0f, 153.97365f, 236.0f, 112.0f),
                    PathNode.CurveTo(236.0f, 70.02636f, 201.97365f, 36.0f, 160.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.87f, 108.0f),
                    PathNode.LineTo(155.4f, 108.0f),
                    PathNode.LineTo(209.11f, 65.0f),
                    PathNode.CurveTo(220.28403f, 76.64224f, 226.93636f, 91.8901f, 227.87f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(175.76768f, 43.986305f, 191.04593f, 49.475155f, 203.2f, 59.52f),
                    PathNode.LineTo(148.0f, 103.68f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 45.79086f, 149.79086f, 44.0f, 152.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 180.0f),
                    PathNode.LineTo(120.0f, 180.0f),
                    PathNode.CurveTo(84.014984f, 179.95897f, 54.276543f, 151.92036f, 52.12f, 116.0f),
                    PathNode.LineTo(227.88f, 116.0f),
                    PathNode.CurveTo(225.72346f, 151.92036f, 195.985f, 179.95897f, 160.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 224.0f),
                    PathNode.CurveTo(100.0f, 230.62741f, 94.62742f, 236.0f, 88.0f, 236.0f),
                    PathNode.CurveTo(81.37258f, 236.0f, 76.0f, 230.62741f, 76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 217.37259f, 81.37258f, 212.0f, 88.0f, 212.0f),
                    PathNode.CurveTo(94.62742f, 212.0f, 100.0f, 217.37259f, 100.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 224.0f),
                    PathNode.CurveTo(204.0f, 230.62741f, 198.62741f, 236.0f, 192.0f, 236.0f),
                    PathNode.CurveTo(185.37259f, 236.0f, 180.0f, 230.62741f, 180.0f, 224.0f),
                    PathNode.CurveTo(180.0f, 217.37259f, 185.37259f, 212.0f, 192.0f, 212.0f),
                    PathNode.CurveTo(198.62741f, 212.0f, 204.0f, 217.37259f, 204.0f, 224.0f),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
