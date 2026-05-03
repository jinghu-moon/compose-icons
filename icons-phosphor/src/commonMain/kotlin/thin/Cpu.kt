package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorThinIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 100.0f),
                    PathNode.LineTo(104.0f, 100.0f),
                    PathNode.CurveTo(101.79086f, 100.0f, 100.0f, 101.79086f, 100.0f, 104.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.CurveTo(100.0f, 154.20914f, 101.79086f, 156.0f, 104.0f, 156.0f),
                    PathNode.LineTo(152.0f, 156.0f),
                    PathNode.CurveTo(154.20914f, 156.0f, 156.0f, 154.20914f, 156.0f, 152.0f),
                    PathNode.LineTo(156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 101.79086f, 154.20914f, 100.0f, 152.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 148.0f),
                    PathNode.LineTo(108.0f, 148.0f),
                    PathNode.LineTo(108.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 148.0f),
                    PathNode.LineTo(212.0f, 148.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.LineTo(232.0f, 108.0f),
                    PathNode.CurveTo(234.20914f, 108.0f, 236.0f, 106.20914f, 236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 101.79086f, 234.20914f, 100.0f, 232.0f, 100.0f),
                    PathNode.LineTo(212.0f, 100.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(156.0f, 44.0f),
                    PathNode.LineTo(156.0f, 24.0f),
                    PathNode.CurveTo(156.0f, 21.790861f, 154.20914f, 20.0f, 152.0f, 20.0f),
                    PathNode.CurveTo(149.79086f, 20.0f, 148.0f, 21.790861f, 148.0f, 24.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.LineTo(108.0f, 44.0f),
                    PathNode.LineTo(108.0f, 24.0f),
                    PathNode.CurveTo(108.0f, 21.790861f, 106.20914f, 20.0f, 104.0f, 20.0f),
                    PathNode.CurveTo(101.79086f, 20.0f, 100.0f, 21.790861f, 100.0f, 24.0f),
                    PathNode.LineTo(100.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.LineTo(24.0f, 100.0f),
                    PathNode.CurveTo(21.790861f, 100.0f, 20.0f, 101.79086f, 20.0f, 104.0f),
                    PathNode.CurveTo(20.0f, 106.20914f, 21.790861f, 108.0f, 24.0f, 108.0f),
                    PathNode.LineTo(44.0f, 108.0f),
                    PathNode.LineTo(44.0f, 148.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.CurveTo(21.790861f, 148.0f, 20.0f, 149.79086f, 20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 154.20914f, 21.790861f, 156.0f, 24.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 49.37258f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(100.0f, 212.0f),
                    PathNode.LineTo(100.0f, 232.0f),
                    PathNode.CurveTo(100.0f, 234.20914f, 101.79086f, 236.0f, 104.0f, 236.0f),
                    PathNode.CurveTo(106.20914f, 236.0f, 108.0f, 234.20914f, 108.0f, 232.0f),
                    PathNode.LineTo(108.0f, 212.0f),
                    PathNode.LineTo(148.0f, 212.0f),
                    PathNode.LineTo(148.0f, 232.0f),
                    PathNode.CurveTo(148.0f, 234.20914f, 149.79086f, 236.0f, 152.0f, 236.0f),
                    PathNode.CurveTo(154.20914f, 236.0f, 156.0f, 234.20914f, 156.0f, 232.0f),
                    PathNode.LineTo(156.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(232.0f, 156.0f),
                    PathNode.CurveTo(234.20914f, 156.0f, 236.0f, 154.20914f, 236.0f, 152.0f),
                    PathNode.CurveTo(236.0f, 149.79086f, 234.20914f, 148.0f, 232.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 202.20914f, 202.20914f, 204.0f, 200.0f, 204.0f),
                    PathNode.LineTo(56.0f, 204.0f),
                    PathNode.CurveTo(53.79086f, 204.0f, 52.0f, 202.20914f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
