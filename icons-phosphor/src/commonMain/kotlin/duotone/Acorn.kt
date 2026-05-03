package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorDuotoneIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 181.0f, 128.0f, 216.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(128.0f, 216.0f, 40.0f, 181.0f, 40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 112.0f),
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
                    PathNode.MoveTo(232.0f, 104.0f),
                    PathNode.CurveTo(231.96693f, 73.08576f, 206.91423f, 48.03307f, 176.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 34.745167f, 146.74516f, 24.0f, 160.0f, 24.0f),
                    PathNode.CurveTo(164.41827f, 24.0f, 168.0f, 20.418278f, 168.0f, 16.0f),
                    PathNode.CurveTo(168.0f, 11.581722f, 164.41827f, 8.0f, 160.0f, 8.0f),
                    PathNode.CurveTo(137.90862f, 8.0f, 120.0f, 25.90861f, 120.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(49.085766f, 48.03307f, 24.03307f, 73.08576f, 24.0f, 104.0f),
                    PathNode.CurveTo(24.009422f, 109.70681f, 27.057743f, 114.9766f, 32.0f, 117.83f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 163.53f, 65.12f, 190.12f, 91.74f, 211.49f),
                    PathNode.CurveTo(103.66f, 221.07f, 120.0f, 234.18f, 120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 234.18f, 152.34f, 221.07f, 164.26f, 211.49f),
                    PathNode.CurveTo(190.88f, 190.12f, 224.0f, 163.53f, 224.0f, 128.0f),
                    PathNode.LineTo(224.0f, 117.83f),
                    PathNode.CurveTo(228.94226f, 114.9766f, 231.99057f, 109.70681f, 232.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(198.07768f, 64.03304f, 215.96696f, 81.92231f, 216.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 81.90861f, 57.90861f, 64.0f, 80.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.25f, 199.0f),
                    PathNode.CurveTo(143.63f, 207.52f, 134.25f, 215.0f, 128.0f, 222.37f),
                    PathNode.CurveTo(121.75f, 215.05f, 112.37f, 207.52f, 101.75f, 199.0f),
                    PathNode.CurveTo(77.8f, 179.79f, 48.0f, 155.86f, 48.0f, 128.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 155.86f, 178.2f, 179.79f, 154.25f, 199.0f),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
