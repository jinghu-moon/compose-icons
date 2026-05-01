package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorThinIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 108.0f),
                    PathNode.LineTo(208.0f, 108.0f),
                    PathNode.CurveTo(214.62741f, 108.0f, 220.0f, 102.62742f, 220.0f, 96.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(153.37259f, 36.0f, 148.0f, 41.37258f, 148.0f, 48.0f),
                    PathNode.LineTo(148.0f, 68.0f),
                    PathNode.LineTo(128.0f, 68.0f),
                    PathNode.CurveTo(116.95431f, 68.0f, 108.0f, 76.95431f, 108.0f, 88.0f),
                    PathNode.LineTo(108.0f, 124.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 105.37258f, 62.62742f, 100.0f, 56.0f, 100.0f),
                    PathNode.LineTo(24.0f, 100.0f),
                    PathNode.CurveTo(17.372583f, 100.0f, 12.0f, 105.37258f, 12.0f, 112.0f),
                    PathNode.LineTo(12.0f, 144.0f),
                    PathNode.CurveTo(12.0f, 150.62741f, 17.372583f, 156.0f, 24.0f, 156.0f),
                    PathNode.LineTo(56.0f, 156.0f),
                    PathNode.CurveTo(62.62742f, 156.0f, 68.0f, 150.62741f, 68.0f, 144.0f),
                    PathNode.LineTo(68.0f, 132.0f),
                    PathNode.LineTo(108.0f, 132.0f),
                    PathNode.LineTo(108.0f, 168.0f),
                    PathNode.CurveTo(108.0f, 179.0457f, 116.95431f, 188.0f, 128.0f, 188.0f),
                    PathNode.LineTo(148.0f, 188.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 153.37259f, 220.0f, 160.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 153.37259f, 214.62741f, 148.0f, 208.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(153.37259f, 148.0f, 148.0f, 153.37259f, 148.0f, 160.0f),
                    PathNode.LineTo(148.0f, 180.0f),
                    PathNode.LineTo(128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 81.37258f, 121.37258f, 76.0f, 128.0f, 76.0f),
                    PathNode.LineTo(148.0f, 76.0f),
                    PathNode.LineTo(148.0f, 96.0f),
                    PathNode.CurveTo(148.0f, 102.62742f, 153.37259f, 108.0f, 160.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 146.20914f, 58.20914f, 148.0f, 56.0f, 148.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.CurveTo(21.790861f, 148.0f, 20.0f, 146.20914f, 20.0f, 144.0f),
                    PathNode.LineTo(20.0f, 112.0f),
                    PathNode.CurveTo(20.0f, 109.79086f, 21.790861f, 108.0f, 24.0f, 108.0f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.CurveTo(58.20914f, 108.0f, 60.0f, 109.79086f, 60.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 157.79086f, 157.79086f, 156.0f, 160.0f, 156.0f),
                    PathNode.LineTo(208.0f, 156.0f),
                    PathNode.CurveTo(210.20914f, 156.0f, 212.0f, 157.79086f, 212.0f, 160.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(157.79086f, 212.0f, 156.0f, 210.20914f, 156.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 157.79086f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 98.20914f, 210.20914f, 100.0f, 208.0f, 100.0f),
                    PathNode.LineTo(160.0f, 100.0f),
                    PathNode.CurveTo(157.79086f, 100.0f, 156.0f, 98.20914f, 156.0f, 96.0f),
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
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
