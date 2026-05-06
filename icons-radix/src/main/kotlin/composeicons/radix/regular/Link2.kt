package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Link2: ImageVector
    get() {
        if (_link2 != null) return _link2!!
        _link2 = radixIcon(
            name = "Link2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.689 6.375c.194-.128 .458-.106 .629 .064 .195 .195 .195 .512 0 .707l-.619 .619c-.32 .32-.492 .493-.602 .625l-.093 .121c-.459 .676-.468 1.532-.051 2.167l.085 .114c.102 .123 .264 .287 .572 .596 .412 .412 .566 .562 .71 .657l.121 .073c.62 .341 1.412 .307 2.046-.124l.121-.093c.132-.11 .306-.281 .626-.602l.618-.619c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707l-.618 .619c-.296 .296-.508 .509-.702 .67l-.19 .145c-.932 .633-2.127 .703-3.089 .174l-.188-.114c-.251-.165-.492-.409-.868-.785-.282-.282-.491-.489-.646-.68l-.14-.189C1.468 10.238 1.503 8.944 2.178 7.95l.145-.19c.161-.194 .374-.406 .67-.702l.619-.618 .078-.064ZM8.914 5.378c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L6.086 9.62c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L8.914 5.378ZM8.139 2.059c.965-.558 2.16-.55 3.088 .06l.189 .14c.191 .156 .397 .364 .68 .646 .376 .376 .62 .617 .785 .868l.114 .188c.494 .897 .466 1.999-.055 2.899l-.119 .189c-.086 .126-.191 .251-.323 .393l-.491 .5-.619 .618c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l.619-.618 .468-.477c.107-.114 .174-.193 .227-.271l.081-.129c.353-.61 .362-1.338 .043-1.917l-.073-.121c-.095-.144-.245-.298-.657-.71-.309-.309-.472-.471-.596-.572l-.114-.085C10.083 2.563 9.294 2.546 8.64 2.924l-.129 .081c-.077 .052-.157 .12-.271 .227l-.476 .468-.619 .619c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l.618-.619 .5-.49c.142-.133 .266-.238 .393-.324l.189-.119Z"),
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
        return _link2!!
    }

private var _link2: ImageVector? = null
