package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorThinIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.76 69.66l-88-48.18c-3.589-1.964-7.931-1.964-11.52 0L34.24 69.66C30.395 71.764 28.003 75.797 28 80.18v95.64c.003 4.383 2.395 8.416 6.24 10.52l88 48.18c3.587 1.973 7.933 1.973 11.52 0l88-48.18c3.845-2.104 6.237-6.137 6.24-10.52v-95.64c-.003-4.383-2.395-8.416-6.24-10.52ZM128 123.44l-87.67-48L83.14 52l42.94 23.5c1.196 .655 2.644 .655 3.84 0L172.86 52l42.81 23.43ZM126.08 28.5c1.193-.666 2.647-.666 3.84 0l34.61 19L128 67.44 91.47 47.44ZM36 175.82v-43.35l40 21.9v45.72L38.08 179.33c-1.283-.702-2.08-2.048-2.08-3.51ZM84 204.47v-52.47c0-1.462-.797-2.808-2.08-3.51L36 123.35v-41.16l88 48.18v96ZM132 226.36v-96L220 82.18v41.16l-45.92 25.14c-1.286 .704-2.084 2.054-2.08 3.52v52.47ZM217.92 179.36 180 200.09v-45.72l40-21.9v43.35c0 1.462-.797 2.808-2.08 3.51Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
