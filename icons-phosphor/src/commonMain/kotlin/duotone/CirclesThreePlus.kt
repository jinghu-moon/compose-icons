package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CirclesThreePlus: ImageVector
    get() {
        if (_circlesThreePlus != null) return _circlesThreePlus!!
        _circlesThreePlus = phosphorDuotoneIcon(
            name = "CirclesThreePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 97.67311f, 97.67311f, 112.0f, 80.0f, 112.0f),
                    PathNode.CurveTo(62.32689f, 112.0f, 48.0f, 97.67311f, 48.0f, 80.0f),
                    PathNode.CurveTo(48.0f, 62.32689f, 62.32689f, 48.0f, 80.0f, 48.0f),
                    PathNode.CurveTo(97.67311f, 48.0f, 112.0f, 62.32689f, 112.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 48.0f),
                    PathNode.CurveTo(158.32689f, 48.0f, 144.0f, 62.32689f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 97.67311f, 158.32689f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(193.67311f, 112.0f, 208.0f, 97.67311f, 208.0f, 80.0f),
                    PathNode.CurveTo(208.0f, 62.32689f, 193.67311f, 48.0f, 176.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 144.0f),
                    PathNode.CurveTo(62.32689f, 144.0f, 48.0f, 158.32689f, 48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 193.67311f, 62.32689f, 208.0f, 80.0f, 208.0f),
                    PathNode.CurveTo(97.67311f, 208.0f, 112.0f, 193.67311f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 158.32689f, 97.67311f, 144.0f, 80.0f, 144.0f),
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
                    PathNode.MoveTo(80.0f, 40.0f),
                    PathNode.CurveTo(57.90861f, 40.0f, 40.0f, 57.90861f, 40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 102.09139f, 57.90861f, 120.0f, 80.0f, 120.0f),
                    PathNode.CurveTo(102.09139f, 120.0f, 120.0f, 102.09139f, 120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 57.90861f, 102.09139f, 40.0f, 80.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 104.0f),
                    PathNode.CurveTo(66.74516f, 104.0f, 56.0f, 93.25484f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 66.74516f, 66.74516f, 56.0f, 80.0f, 56.0f),
                    PathNode.CurveTo(93.25484f, 56.0f, 104.0f, 66.74516f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 93.25484f, 93.25484f, 104.0f, 80.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(198.09138f, 120.0f, 216.0f, 102.09139f, 216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 57.90861f, 198.09138f, 40.0f, 176.0f, 40.0f),
                    PathNode.CurveTo(153.90862f, 40.0f, 136.0f, 57.90861f, 136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 102.09139f, 153.90862f, 120.0f, 176.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 56.0f),
                    PathNode.CurveTo(189.25484f, 56.0f, 200.0f, 66.74516f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 93.25484f, 189.25484f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(162.74516f, 104.0f, 152.0f, 93.25484f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 66.74516f, 162.74516f, 56.0f, 176.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 136.0f),
                    PathNode.CurveTo(57.90861f, 136.0f, 40.0f, 153.90862f, 40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 198.09138f, 57.90861f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(102.09139f, 216.0f, 120.0f, 198.09138f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 153.90862f, 102.09139f, 136.0f, 80.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.CurveTo(66.74516f, 200.0f, 56.0f, 189.25484f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 162.74516f, 66.74516f, 152.0f, 80.0f, 152.0f),
                    PathNode.CurveTo(93.25484f, 152.0f, 104.0f, 162.74516f, 104.0f, 176.0f),
                    PathNode.CurveTo(104.0f, 189.25484f, 93.25484f, 200.0f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 180.41827f, 212.41827f, 184.0f, 208.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(184.0f, 212.41827f, 180.41827f, 216.0f, 176.0f, 216.0f),
                    PathNode.CurveTo(171.58173f, 216.0f, 168.0f, 212.41827f, 168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 171.58173f, 139.58173f, 168.0f, 144.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 139.58173f, 171.58173f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(180.41827f, 136.0f, 184.0f, 139.58173f, 184.0f, 144.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(212.41827f, 168.0f, 216.0f, 171.58173f, 216.0f, 176.0f),
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
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null
