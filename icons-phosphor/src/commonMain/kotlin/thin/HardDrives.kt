package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorThinIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(41.37258f, 140.0f, 36.0f, 145.37259f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 206.62741f, 41.37258f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(214.62741f, 212.0f, 220.0f, 206.62741f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 145.37259f, 214.62741f, 140.0f, 208.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 202.20914f, 210.20914f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(45.79086f, 204.0f, 44.0f, 202.20914f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 149.79086f, 45.79086f, 148.0f, 48.0f, 148.0f),
                    PathNode.LineTo(208.0f, 148.0f),
                    PathNode.CurveTo(210.20914f, 148.0f, 212.0f, 149.79086f, 212.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(41.37258f, 44.0f, 36.0f, 49.37258f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 110.62742f, 41.37258f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(214.62741f, 116.0f, 220.0f, 110.62742f, 220.0f, 104.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 49.37258f, 214.62741f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 106.20914f, 210.20914f, 108.0f, 208.0f, 108.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.CurveTo(45.79086f, 108.0f, 44.0f, 106.20914f, 44.0f, 104.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 45.79086f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(210.20914f, 52.0f, 212.0f, 53.79086f, 212.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 180.41827f, 184.41827f, 184.0f, 180.0f, 184.0f),
                    PathNode.CurveTo(175.58173f, 184.0f, 172.0f, 180.41827f, 172.0f, 176.0f),
                    PathNode.CurveTo(172.0f, 171.58173f, 175.58173f, 168.0f, 180.0f, 168.0f),
                    PathNode.CurveTo(184.41827f, 168.0f, 188.0f, 171.58173f, 188.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 80.0f),
                    PathNode.CurveTo(188.0f, 84.41828f, 184.41827f, 88.0f, 180.0f, 88.0f),
                    PathNode.CurveTo(175.58173f, 88.0f, 172.0f, 84.41828f, 172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 75.58172f, 175.58173f, 72.0f, 180.0f, 72.0f),
                    PathNode.CurveTo(184.41827f, 72.0f, 188.0f, 75.58172f, 188.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
