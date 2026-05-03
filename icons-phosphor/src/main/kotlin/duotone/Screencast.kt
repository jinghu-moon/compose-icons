package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorDuotoneIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 48.000 208.000 C 48.000 199.163 40.837 192.000 32.000 192.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 144.000 216.000 C 139.582 216.000 136.000 212.418 136.000 208.000 C 136.000 203.582 139.582 200.000 144.000 200.000 L 216.000 200.000 L 216.000 56.000 L 40.000 56.000 L 40.000 96.000 C 40.000 100.418 36.418 104.000 32.000 104.000 C 27.582 104.000 24.000 100.418 24.000 96.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 32.000 184.000 C 27.582 184.000 24.000 187.582 24.000 192.000 C 24.000 196.418 27.582 200.000 32.000 200.000 C 36.418 200.000 40.000 203.582 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 C 52.418 216.000 56.000 212.418 56.000 208.000 C 56.000 194.745 45.255 184.000 32.000 184.000 ZM 32.000 152.000 C 27.582 152.000 24.000 155.582 24.000 160.000 C 24.000 164.418 27.582 168.000 32.000 168.000 C 54.091 168.000 72.000 185.909 72.000 208.000 C 72.000 212.418 75.582 216.000 80.000 216.000 C 84.418 216.000 88.000 212.418 88.000 208.000 C 87.967 177.086 62.914 152.033 32.000 152.000 ZM 32.000 120.000 C 27.582 120.000 24.000 123.582 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 C 71.746 136.044 103.956 168.254 104.000 208.000 C 104.000 212.418 107.582 216.000 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 C 119.945 159.422 80.578 120.055 32.000 120.000 Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
