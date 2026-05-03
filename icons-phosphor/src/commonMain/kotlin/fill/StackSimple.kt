package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorFillIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 111.0f),
                    PathNode.LineTo(124.0f, 175.0f),
                    PathNode.CurveTo(126.459915f, 176.40608f, 129.48009f, 176.40608f, 131.94f, 175.0f),
                    PathNode.LineTo(243.94f, 111.0f),
                    PathNode.CurveTo(246.43658f, 109.57676f, 247.978f, 106.92378f, 247.978f, 104.05f),
                    PathNode.CurveTo(247.978f, 101.17622f, 246.43658f, 98.52324f, 243.94f, 97.1f),
                    PathNode.LineTo(131.94f, 33.1f),
                    PathNode.CurveTo(129.48009f, 31.693916f, 126.459915f, 31.693916f, 124.0f, 33.1f),
                    PathNode.LineTo(12.0f, 97.1f),
                    PathNode.CurveTo(9.503405f, 98.52324f, 7.962007f, 101.17622f, 7.962007f, 104.05f),
                    PathNode.CurveTo(7.962007f, 106.92378f, 9.503405f, 109.57676f, 12.0f, 111.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 137.05f),
                    PathNode.LineTo(128.0f, 198.79f),
                    PathNode.LineTo(20.0f, 137.05f),
                    PathNode.CurveTo(16.147814f, 134.84087f, 11.234139f, 136.17282f, 9.025f, 140.025f),
                    PathNode.CurveTo(6.815861f, 143.87718f, 8.147814f, 148.79086f, 12.0f, 151.0f),
                    PathNode.LineTo(124.0f, 215.0f),
                    PathNode.CurveTo(126.459915f, 216.40608f, 129.48009f, 216.40608f, 131.94f, 215.0f),
                    PathNode.LineTo(243.94f, 151.0f),
                    PathNode.CurveTo(247.77838f, 148.80743f, 249.11256f, 143.91838f, 246.92f, 140.08f),
                    PathNode.CurveTo(244.72745f, 136.24162f, 239.83838f, 134.90742f, 236.0f, 137.1f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
