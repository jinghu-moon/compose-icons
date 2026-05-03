package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorDuotoneIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 64.0f),
                    PathNode.CurveTo(80.0f, 77.25484f, 69.25484f, 88.0f, 56.0f, 88.0f),
                    PathNode.CurveTo(42.745167f, 88.0f, 32.0f, 77.25484f, 32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 50.745167f, 42.745167f, 40.0f, 56.0f, 40.0f),
                    PathNode.CurveTo(69.25484f, 40.0f, 80.0f, 50.745167f, 80.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(186.74516f, 168.0f, 176.0f, 178.74516f, 176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 205.25484f, 186.74516f, 216.0f, 200.0f, 216.0f),
                    PathNode.CurveTo(213.25484f, 216.0f, 224.0f, 205.25484f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 178.74516f, 213.25484f, 168.0f, 200.0f, 168.0f),
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
                    PathNode.MoveTo(112.0f, 152.0f),
                    PathNode.CurveTo(107.58172f, 152.0f, 104.0f, 155.58173f, 104.0f, 160.0f),
                    PathNode.LineTo(104.0f, 188.69f),
                    PathNode.LineTo(66.34f, 151.0f),
                    PathNode.CurveTo(64.84743f, 149.50578f, 64.00627f, 147.48198f, 64.0f, 145.37f),
                    PathNode.LineTo(64.0f, 95.0f),
                    PathNode.CurveTo(79.602455f, 90.971466f, 89.7754f, 75.9697f, 87.74495f, 59.983997f),
                    PathNode.CurveTo(85.7145f, 43.998287f, 72.11414f, 32.016132f, 56.0f, 32.016132f),
                    PathNode.CurveTo(39.885857f, 32.016132f, 26.285501f, 43.998287f, 24.25505f, 59.983997f),
                    PathNode.CurveTo(22.224598f, 75.9697f, 32.397545f, 90.971466f, 48.0f, 95.0f),
                    PathNode.LineTo(48.0f, 145.38f),
                    PathNode.CurveTo(47.967735f, 151.75443f, 50.48859f, 157.8765f, 55.0f, 162.38f),
                    PathNode.LineTo(92.69f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 203.58173f, 56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 212.41827f, 59.581722f, 216.0f, 64.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.CurveTo(116.41828f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(120.0f, 155.58173f, 116.41828f, 152.0f, 112.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 55.163445f, 47.163445f, 48.0f, 56.0f, 48.0f),
                    PathNode.CurveTo(64.836555f, 48.0f, 72.0f, 55.163445f, 72.0f, 64.0f),
                    PathNode.CurveTo(72.0f, 72.836555f, 64.836555f, 80.0f, 56.0f, 80.0f),
                    PathNode.CurveTo(47.163445f, 80.0f, 40.0f, 72.836555f, 40.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 161.0f),
                    PathNode.LineTo(208.0f, 110.63f),
                    PathNode.CurveTo(208.03226f, 104.25557f, 205.51141f, 98.1335f, 201.0f, 93.63f),
                    PathNode.LineTo(163.31f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(196.41827f, 56.0f, 200.0f, 52.418278f, 200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 43.581722f, 196.41827f, 40.0f, 192.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(139.58173f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 100.41828f, 139.58173f, 104.0f, 144.0f, 104.0f),
                    PathNode.CurveTo(148.41827f, 104.0f, 152.0f, 100.41828f, 152.0f, 96.0f),
                    PathNode.LineTo(152.0f, 67.31f),
                    PathNode.LineTo(189.66f, 105.0f),
                    PathNode.CurveTo(191.15993f, 106.50158f, 192.00166f, 108.537636f, 192.0f, 110.66f),
                    PathNode.LineTo(192.0f, 161.0f),
                    PathNode.CurveTo(176.39755f, 165.02853f, 166.2246f, 180.03029f, 168.25505f, 196.016f),
                    PathNode.CurveTo(170.2855f, 212.00171f, 183.88585f, 223.98387f, 200.0f, 223.98387f),
                    PathNode.CurveTo(216.11415f, 223.98387f, 229.7145f, 212.00171f, 231.74495f, 196.016f),
                    PathNode.CurveTo(233.7754f, 180.03029f, 223.60245f, 165.02853f, 208.0f, 161.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.CurveTo(191.16344f, 208.0f, 184.0f, 200.83656f, 184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 183.16344f, 191.16344f, 176.0f, 200.0f, 176.0f),
                    PathNode.CurveTo(208.83656f, 176.0f, 216.0f, 183.16344f, 216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 200.83656f, 208.83656f, 208.0f, 200.0f, 208.0f),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
