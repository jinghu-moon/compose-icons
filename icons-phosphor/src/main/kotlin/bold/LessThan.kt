package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorBoldIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.84f, 205.13f),
                    PathNode.CurveTo(209.47804f, 208.01128f, 207.02588f, 210.23245f, 204.02434f, 211.30362f),
                    PathNode.CurveTo(201.02278f, 212.3748f, 197.71841f, 212.208f, 194.84f, 210.84f),
                    PathNode.LineTo(42.84f, 138.84f),
                    PathNode.CurveTo(38.65461f, 136.85262f, 35.98727f, 132.63327f, 35.98727f, 128.0f),
                    PathNode.CurveTo(35.98727f, 123.36673f, 38.65461f, 119.14739f, 42.84f, 117.16f),
                    PathNode.LineTo(194.84f, 45.16f),
                    PathNode.CurveTo(198.72272f, 43.268517f, 203.32236f, 43.60943f, 206.8838f, 46.052647f),
                    PathNode.CurveTo(210.44525f, 48.495865f, 212.41904f, 52.66445f, 212.052f, 56.96776f),
                    PathNode.CurveTo(211.68497f, 61.271072f, 209.03375f, 65.0452f, 205.11f, 66.85f),
                    PathNode.LineTo(76.0f, 128.0f),
                    PathNode.LineTo(205.1f, 189.15f),
                    PathNode.CurveTo(207.98145f, 190.50659f, 210.20543f, 192.95299f, 211.28207f, 195.9503f),
                    PathNode.CurveTo(212.3587f, 198.94763f, 212.19968f, 202.25f, 210.84f, 205.13f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
