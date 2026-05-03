package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorThinIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.66f, 67.0f),
                    PathNode.LineTo(22.0f, 128.0f),
                    PathNode.LineTo(90.64f, 189.0f),
                    PathNode.CurveTo(92.29686f, 190.46907f, 92.44907f, 193.00314f, 90.98f, 194.66f),
                    PathNode.CurveTo(89.510925f, 196.31685f, 86.97685f, 196.46907f, 85.32f, 195.0f),
                    PathNode.LineTo(13.32f, 131.0f),
                    PathNode.CurveTo(12.458999f, 130.24066f, 11.965752f, 129.148f, 11.965752f, 128.0f),
                    PathNode.CurveTo(11.965752f, 126.852f, 12.458999f, 125.75933f, 13.32f, 125.0f),
                    PathNode.LineTo(85.32f, 61.0f),
                    PathNode.CurveTo(86.97685f, 59.53092f, 89.510925f, 59.683147f, 90.98f, 61.34f),
                    PathNode.CurveTo(92.44907f, 62.996853f, 92.29686f, 65.53092f, 90.64f, 67.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.66f, 125.0f),
                    PathNode.LineTo(170.66f, 61.0f),
                    PathNode.CurveTo(169.00314f, 59.53092f, 166.46907f, 59.683147f, 165.0f, 61.34f),
                    PathNode.CurveTo(163.53093f, 62.996853f, 163.68315f, 65.53092f, 165.34f, 67.0f),
                    PathNode.LineTo(234.0f, 128.0f),
                    PathNode.LineTo(165.36f, 189.0f),
                    PathNode.CurveTo(163.70314f, 190.46907f, 163.55092f, 193.00314f, 165.02f, 194.66f),
                    PathNode.CurveTo(166.48907f, 196.31685f, 169.02315f, 196.46907f, 170.68f, 195.0f),
                    PathNode.LineTo(242.68f, 131.0f),
                    PathNode.CurveTo(243.54102f, 130.24066f, 244.03426f, 129.148f, 244.03426f, 128.0f),
                    PathNode.CurveTo(244.03426f, 126.852f, 243.54102f, 125.75933f, 242.68f, 125.0f),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
