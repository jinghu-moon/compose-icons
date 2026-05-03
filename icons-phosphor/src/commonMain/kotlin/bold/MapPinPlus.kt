package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorBoldIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 110.62742f, 166.62741f, 116.0f, 160.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 142.62741f, 134.62741f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(121.37258f, 148.0f, 116.0f, 142.62741f, 116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(89.37258f, 116.0f, 84.0f, 110.62742f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 97.37258f, 89.37258f, 92.0f, 96.0f, 92.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 65.37258f, 121.37258f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(134.62741f, 60.0f, 140.0f, 65.37258f, 140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.CurveTo(166.62741f, 92.0f, 172.0f, 97.37258f, 172.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 136.38f, 205.15f, 170.57f, 177.06f, 202.87f),
                    PathNode.CurveTo(164.48969f, 217.39388f, 150.34268f, 230.47432f, 134.88f, 241.87f),
                    PathNode.CurveTo(130.74884f, 244.76085f, 125.25116f, 244.76085f, 121.12f, 241.87f),
                    PathNode.CurveTo(117.64f, 239.4f, 36.0f, 181.36f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 53.189804f, 77.18981f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(178.8102f, 12.0f, 220.0f, 53.189804f, 220.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 66.44463f, 165.55536f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(90.44463f, 36.0f, 60.0f, 66.44463f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 137.31f, 80.0f, 167.37f, 96.7f, 186.71f),
                    PathNode.CurveTo(106.23466f, 197.6622f, 116.707794f, 207.76057f, 128.0f, 216.89f),
                    PathNode.CurveTo(139.2922f, 207.76057f, 149.76535f, 197.6622f, 159.3f, 186.71f),
                    PathNode.CurveTo(176.0f, 167.37f, 196.0f, 137.31f, 196.0f, 104.0f),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
