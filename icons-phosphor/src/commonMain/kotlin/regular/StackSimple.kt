package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorRegularIcon(
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
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 49.21f),
                    PathNode.LineTo(223.87f, 104.0f),
                    PathNode.LineTo(128.0f, 158.79f),
                    PathNode.LineTo(32.13f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.94f, 140.0f),
                    PathNode.CurveTo(248.02281f, 141.8453f, 248.32133f, 144.04745f, 247.76889f, 146.11443f),
                    PathNode.CurveTo(247.21645f, 148.18141f, 245.85905f, 149.94098f, 244.0f, 151.0f),
                    PathNode.LineTo(132.0f, 215.0f),
                    PathNode.CurveTo(129.54008f, 216.40608f, 126.51991f, 216.40608f, 124.06f, 215.0f),
                    PathNode.LineTo(12.0f, 151.0f),
                    PathNode.CurveTo(8.147814f, 148.79086f, 6.815861f, 143.87718f, 9.025f, 140.025f),
                    PathNode.CurveTo(11.234139f, 136.17282f, 16.147814f, 134.84087f, 20.0f, 137.05f),
                    PathNode.LineTo(128.0f, 198.79f),
                    PathNode.LineTo(236.0f, 137.05f),
                    PathNode.CurveTo(237.84119f, 135.9872f, 240.02968f, 135.70093f, 242.08228f, 136.25443f),
                    PathNode.CurveTo(244.13487f, 136.8079f, 245.88275f, 138.15562f, 246.94f, 140.0f),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
