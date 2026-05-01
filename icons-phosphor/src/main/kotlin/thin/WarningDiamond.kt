package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorThinIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 77.79086f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 77.79086f, 132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(123.58172f, 164.0f, 120.0f, 167.58173f, 120.0f, 172.0f),
                    PathNode.CurveTo(120.0f, 176.41827f, 123.58172f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(132.41827f, 180.0f, 136.0f, 176.41827f, 136.0f, 172.0f),
                    PathNode.CurveTo(136.0f, 167.58173f, 132.41827f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0089f, 131.17111f, 234.74855f, 134.21393f, 232.5f, 136.45f),
                    PathNode.LineTo(136.45f, 232.51f),
                    PathNode.CurveTo(131.7719f, 237.14944f, 124.2281f, 237.14944f, 119.55f, 232.51f),
                    PathNode.LineTo(119.55f, 232.51f),
                    PathNode.LineTo(23.55f, 136.45f),
                    PathNode.CurveTo(18.910555f, 131.7719f, 18.910555f, 124.2281f, 23.55f, 119.55f),
                    PathNode.LineTo(119.6f, 23.49f),
                    PathNode.CurveTo(124.27811f, 18.850555f, 131.8219f, 18.850555f, 136.5f, 23.49f),
                    PathNode.LineTo(232.55f, 119.55f),
                    PathNode.CurveTo(234.78023f, 121.7943f, 236.02214f, 124.8361f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.00394f, 126.95191f, 227.58586f, 125.94635f, 226.84f, 125.21f),
                    PathNode.LineTo(130.79f, 29.15f),
                    PathNode.CurveTo(129.23709f, 27.638453f, 126.76291f, 27.638453f, 125.21f, 29.15f),
                    PathNode.LineTo(29.21f, 125.21f),
                    PathNode.CurveTo(28.468657f, 125.94922f, 28.051996f, 126.95309f, 28.051996f, 128.0f),
                    PathNode.CurveTo(28.051996f, 129.04692f, 28.468657f, 130.05078f, 29.21f, 130.79f),
                    PathNode.LineTo(125.26f, 226.85f),
                    PathNode.CurveTo(126.812904f, 228.36154f, 129.2871f, 228.36154f, 130.84f, 226.85f),
                    PathNode.LineTo(226.89f, 130.79f),
                    PathNode.CurveTo(227.61754f, 130.04541f, 228.0172f, 129.04088f, 228.0f, 128.0f),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
