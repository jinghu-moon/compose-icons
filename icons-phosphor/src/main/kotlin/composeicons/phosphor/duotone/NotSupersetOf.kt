package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorDuotoneIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104c0 30.928-25.072 56-56 56h-96v-112h96c30.928 0 56 25.072 56 56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 192h-127.37l21.82-24h49.55c25.263-.017 48.152-14.894 58.426-37.974 10.274-23.08 6.009-50.044-10.886-68.826L213.92 45.38c2.907-3.277 2.638-8.283-.604-11.229-3.242-2.946-8.251-2.737-11.236 .469L187.43 50.73C176.944 43.723 164.612 39.988 152 40h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c8.63-.008 17.101 2.325 24.51 6.75L95.37 152h-39.37c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24.82L42.08 210.62c-1.963 2.109-2.641 5.11-1.774 7.858 .867 2.748 3.144 4.817 5.961 5.418 2.818 .601 5.741-.36 7.653-2.515L66.08 208h141.92c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM188.71 73.12c12 14.281 14.641 34.221 6.77 51.133C187.609 141.165 170.654 151.985 152 152h-35Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
