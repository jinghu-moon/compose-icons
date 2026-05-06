package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = phosphorThinIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 124c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM96 188C80.536 188 68 175.464 68 160c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM218.83 125.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-48 48c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l48-48c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM186.83 106.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l24-24c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM226.83 66.83l-16 16c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l16-16c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM125.17 93.17l72-72c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66l-72 72c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66ZM144.08 202.43c1.558 1.561 1.558 4.089 0 5.65-17.109 17.512-42.312 24.476-65.985 18.231C54.422 220.066 35.934 201.578 29.689 177.905c-6.245-23.673 .718-48.875 18.231-65.985L130.66 29.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L53.57 117.57c-23.433 23.433-23.433 61.427 0 84.86 23.433 23.433 61.427 23.433 84.86 0 1.561-1.558 4.089-1.558 5.65 0Z"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
