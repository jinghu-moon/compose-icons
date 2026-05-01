package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorBoldIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 124.0f),
                    PathNode.LineTo(203.42f, 124.0f),
                    PathNode.LineTo(179.42f, 76.0f),
                    PathNode.LineTo(192.0f, 76.0f),
                    PathNode.CurveTo(198.62741f, 76.0f, 204.0f, 70.62742f, 204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 57.37258f, 198.62741f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(57.37258f, 52.0f, 52.0f, 57.37258f, 52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 70.62742f, 57.37258f, 76.0f, 64.0f, 76.0f),
                    PathNode.LineTo(76.58f, 76.0f),
                    PathNode.LineTo(52.58f, 124.0f),
                    PathNode.LineTo(12.0f, 124.0f),
                    PathNode.CurveTo(5.372583f, 124.0f, 0f, 129.37259f, 0f, 136.0f),
                    PathNode.CurveTo(0f, 142.62741f, 5.372583f, 148.0f, 12.0f, 148.0f),
                    PathNode.LineTo(40.58f, 148.0f),
                    PathNode.LineTo(21.27f, 186.63f),
                    PathNode.CurveTo(19.22836f, 190.4782f, 19.432545f, 195.13058f, 21.803467f, 198.78513f),
                    PathNode.CurveTo(24.174389f, 202.43967f, 28.339634f, 204.5223f, 32.685814f, 204.2263f),
                    PathNode.CurveTo(37.031994f, 203.93034f, 40.87643f, 201.30223f, 42.73f, 197.36f),
                    PathNode.LineTo(67.42f, 148.0f),
                    PathNode.LineTo(188.58f, 148.0f),
                    PathNode.LineTo(213.27f, 197.36f),
                    PathNode.CurveTo(215.12357f, 201.30223f, 218.968f, 203.93034f, 223.3142f, 204.2263f),
                    PathNode.CurveTo(227.66037f, 204.5223f, 231.8256f, 202.43967f, 234.19653f, 198.78513f),
                    PathNode.CurveTo(236.56746f, 195.13058f, 236.77164f, 190.4782f, 234.73f, 186.63f),
                    PathNode.LineTo(215.42f, 148.0f),
                    PathNode.LineTo(244.0f, 148.0f),
                    PathNode.CurveTo(250.62741f, 148.0f, 256.0f, 142.62741f, 256.0f, 136.0f),
                    PathNode.CurveTo(256.0f, 129.37259f, 250.62741f, 124.0f, 244.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(79.42f, 124.0f),
                    PathNode.LineTo(103.42f, 76.0f),
                    PathNode.LineTo(152.58f, 76.0f),
                    PathNode.LineTo(176.58f, 124.0f),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
