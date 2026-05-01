package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) return _brandBitbucket!!
        _brandBitbucket = tablerOutlineIcon(
            name = "BrandBitbucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.648f, 4.0f),
                    PathNode.CurveTo(3.458604f, 3.99748f, 3.27782f, 4.078983f, 3.154297f, 4.222578f),
                    PathNode.CurveTo(3.030775f, 4.366174f, 2.977204f, 4.557108f, 3.008f, 4.744f),
                    PathNode.LineTo(6.148f, 19.272f),
                    PathNode.CurveTo(6.218f, 19.689f, 6.578f, 19.996f, 7.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.317646f, 20.003262f, 17.590223f, 19.774416f, 17.642f, 19.461f),
                    PathNode.LineTo(20.992f, 4.751f),
                    PathNode.CurveTo(21.022429f, 4.56417f, 20.968725f, 4.373444f, 20.845282f, 4.229941f),
                    PathNode.CurveTo(20.721838f, 4.086438f, 20.541279f, 4.004834f, 20.352f, 4.007f),
                    PathNode.LineTo(3.648f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 15.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(14.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
